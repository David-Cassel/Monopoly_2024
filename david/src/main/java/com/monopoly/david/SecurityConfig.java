// package com.monopoly.david;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.web.SecurityFilterChain;

// @Configuration
// @EnableWebSecurity
// public class SecurityConfig {

//     @Bean
//     public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//         http
//             .csrf().disable() // Disable CSRF for simplicity, but be careful with this in production
//             .authorizeRequests()
//             .antMatchers("/subtract").permitAll() // Allow requests to /subtract
//             .anyRequest().authenticated();
        
//         return http.build();
//     }
// }


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
                .requestMatchers("/subtract").permitAll() // Allow requests to /subtract
                .anyRequest().authenticated()
            );
        
        return http.build();
    }
}