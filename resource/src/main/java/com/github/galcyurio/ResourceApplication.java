package com.github.galcyurio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ResourceApplication {

    @GetMapping("/")
    public ResponseEntity<?> message() {
        return new ResponseEntity<>("Hello, resource!", HttpStatus.OK);
    }

    public static void main(String... args) {
        SpringApplication.run(ResourceApplication.class, args);
    }
}
