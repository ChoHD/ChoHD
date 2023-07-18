package com.codestates.hello_oauth2.home;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//@Controller
//public class HomeControllerV4 {
//    @GetMapping("/hello-oauth2")
//    public String Home(@AuthenticationPrincipal OAuth2User oAuth2User) {      // (1)
//
//        System.out.println("User's email in Google: " + oAuth2User.getAttributes().get("email"));
//
//        return "hello-oauth2";
//    }
//}
