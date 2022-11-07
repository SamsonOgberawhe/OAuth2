package com.example.oauth2demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class OAuth2DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(OAuth2DemoApplication.class, args);
    }

}
