package com.springboot.arpit.gaur1.introductionToSpringBoot1;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {


    @Bean
    Pineapple getPineapple(){
        return new Pineapple();
    }
}
