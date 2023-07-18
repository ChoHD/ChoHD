package com.codestates.hello_oauth2.home;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//@Controller
public class HomeControllerV2 {
    @GetMapping("/hello-oauth2")
    public String Home() {
        var oAuth2User = (OAuth2User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();   // (1)
        System.out.println(oAuth2User.getAttributes().get("email"));     // (2)
        return "hello-ouath2";
    }
}
