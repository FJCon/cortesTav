package com.tav.api_rest.Services;

import com.tav.api_rest.Auth.AuthResponse;
import com.tav.api_rest.Auth.LoginRequest;
import com.tav.api_rest.Auth.RegisterRequest;
import com.tav.api_rest.Model.Role;
import com.tav.api_rest.Model.User;
import com.tav.api_rest.Repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthService {
    @Autowired
    private UserRepository userRepository;

    public AuthResponse login(LoginRequest request){
        return null;
    }

    public AuthResponse register(RegisterRequest request){
        Boolean isRegister = userRepository.findByUsername(request.getUsername()).isPresent();

        if (!isRegister) {
            User user = User.builder()
                    .username(request.getUsername())
                    .password(request.getPassword())
                    .firstName(request.getFirstName())
                    .lastName(request.getLastName())
                    .rol(Role.USER)
            .build();

            userRepository.save(user);

            return AuthResponse.builder().token(null).build();
        }

        return null;
    }

}
