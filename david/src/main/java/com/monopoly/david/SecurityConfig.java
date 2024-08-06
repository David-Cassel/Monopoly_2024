
package com.monopoly.david;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable()) // Disable CSRF for simplicity, be careful with this in production
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/static/**", "/js/script.js").permitAll()
                .requestMatchers("/subtract", "/index.html").permitAll()
                .anyRequest().authenticated()
            );
        
        return http.build();
    }
} 