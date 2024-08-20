package com.tav.api_rest.Jwt;

import ch.qos.logback.core.util.StringUtil;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
//Extiende de una clase que se utiliza para crear filtros personalizados
//OncePerRequestFilter: Se utiliza para garantizar que el filtro se ejecuta 1 sola vez por peticion http.
public class JwtAuthenticationFilter extends OncePerRequestFilter {

    @Override
    //Metodo que realiza los filtros relacionados al token
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        final String token = getTokenFromRequest(request);

        if(token == null){  //si el token es nulo, le cedemos el control al filtro.
            filterChain.doFilter(request,response);
            return;
        }
        filterChain.doFilter(request,response); //Llamamos al filtro para que siga con sus tareas
    }

    //Método para obtener token del request
    private String getTokenFromRequest(HttpServletRequest request){
        //Guardamos el string de autorizacion que proviene del header en la peticion http
        final String authHeader = request.getHeader(HttpHeaders.AUTHORIZATION);


        //  Utilizamos StringsUtils para verificar que la autorizacion no es nulo y si contiene
        //  la palabra "Bearer" ya que estamos trabajando con jwt
        if(StringUtils.hasText(authHeader) && authHeader.startsWith("Bearer ")){
            //Retornamos a partir del caracter en la posicion 7 (donde empieza el jwt)
            return authHeader.substring(7);
        }
        return null;
    }
}
