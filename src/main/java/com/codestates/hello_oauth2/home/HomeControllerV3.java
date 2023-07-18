package com.codestates.hello_oauth2.home;

import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//@Controller
public class HomeControllerV3 {
    @GetMapping("/hello-oauth2")
    public String Home(Authentication authentication) {      // (1)
        var oAuth2User = (OAuth2User)authentication.getPrincipal();
        System.out.println(oAuth2User);
        System.out.println("User's email in Google: " + oAuth2User.getAttributes().get("email"));

        return "hello-oauth2";
    }
}
