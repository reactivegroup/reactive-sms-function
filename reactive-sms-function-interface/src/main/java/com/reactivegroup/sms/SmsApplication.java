package com.reactivegroup.sms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class SmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmsApplication.class, args);
    }

    @Bean
    public Function<String, String> upperCase() {
        return s -> s.toUpperCase();
    }

    @Bean
    public Function<SecurityProperties.User, String> user() {
        return user -> user.toString();
    }
}
