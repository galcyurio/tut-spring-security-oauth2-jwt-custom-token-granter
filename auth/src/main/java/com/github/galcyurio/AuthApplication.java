package com.github.galcyurio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@EnableResourceServer
@SpringBootApplication
public class AuthApplication {

    @GetMapping("/user")
    public Principal principal(Principal principal) {
        return principal;
    }

    @GetMapping("/")
    public ResponseEntity<?> message() {
        return new ResponseEntity<>("Hello, OAuth2!", HttpStatus.OK);
    }

    public static void main(String... args) {
        SpringApplication.run(AuthApplication.class, args);
    }
}
