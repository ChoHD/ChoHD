package com.codestates.hello_oauth2.home;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
import org.springframework.security.oauth2.core.OAuth2AccessToken;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//@Controller
//public class HomeControllerV5 {
//    private final OAuth2AuthorizedClientService auth2AuthorizedClientService;
//
//    // (1)
//    public HomeControllerV5(OAuth2AuthorizedClientService auth2AuthorizedClientService) {
//        this.auth2AuthorizedClientService = auth2AuthorizedClientService;
//    }
//    @GetMapping("/hello-oauth2")
//    public String home(Authentication authentication) {
//        var authorizedClient = auth2AuthorizedClientService.loadAuthorizedClient("google", authentication.getName()); // (2)
//
//        OAuth2AccessToken auth2AccessToken = authorizedClient.getAccessToken();
//
//        System.out.println("Access Token Value: " + auth2AccessToken.getTokenValue());  // (3-1)
//        System.out.println("Access Token Type: " + auth2AccessToken.getTokenType().getValue());  // (3-2)
//        System.out.println("Access Token Scopes: " + auth2AccessToken.getScopes());       // (3-3)
//        System.out.println("Access Token Issued At: " + auth2AccessToken.getIssuedAt());    // (3-4)
//        System.out.println("Access Token Expires At: " + auth2AccessToken.getExpiresAt());  // (3-5)
//
//        return "hello-oauth2";
//    }
//}
