package com.tav.api_rest.Config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {

    @Bean
    //Filtro para configurar el acceso a las diferentes rutas
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        return http.csrf(csrf ->csrf.disable()) //Cross-Site Request Forgery - agrega auntentificacion por token - desactivamos
                .authorizeHttpRequests(authRequest ->
                    authRequest
                    .requestMatchers("/**").permitAll()
                    .anyRequest().authenticated()
                )
                .formLogin(null).build();
    }


}