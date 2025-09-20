package com.Bank.Transaction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    /*public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable()    // Disable CSRF for Postman testing
                .authorizeHttpRequests()
                .anyRequest().permitAll()// Allow all requests
        return http.build();*/

        public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
            final AuthorizeHttpRequestsConfigurer<HttpSecurity>.AuthorizationManagerRequestMatcherRegistry authorizationManagerRequestMatcherRegistry = http.csrf().disable().authorizeHttpRequests().anyRequest().permitAll();// Allow all requests
            return http.build();
        }
    }
}

