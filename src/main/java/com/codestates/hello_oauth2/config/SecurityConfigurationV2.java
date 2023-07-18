package com.codestates.hello_oauth2.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.oauth2.client.CommonOAuth2Provider;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

//@Configuration
//@EnableWebSecurity(debug = true)
public class SecurityConfigurationV2 {
    @Value("${spring.security.oauth2.client.registration.google.clientId}")  // (1)
    private String clientId;

    @Value("${spring.security.oauth2.client.registration.google.clientSecret}") // (2)
    private String clientSecret;

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .formLogin().disable()
                .httpBasic().disable()
                .authorizeHttpRequests(authorize -> authorize
                        .anyRequest().authenticated()
                )
                .oauth2Login(withDefaults());
        return http.build();
    }
    @Bean         // (3)
    public ClientRegistrationRepository clientRegistrationRepository() {
        var clientRegistration = clientRegistration();          // (3-1)

        return new InMemoryClientRegistrationRepository(clientRegistration);         // (3-2)
    }
    private ClientRegistration clientRegistration() {      // (4)
        return CommonOAuth2Provider            // (4-1)
                .GOOGLE
                .getBuilder("google")
                .clientId(clientId)
                .clientSecret(clientSecret)
                .build();
    }
}
