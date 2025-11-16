package com.springboot.arpit.gaur1.introductionToSpringBoot1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroductionToSpringBoot1Application implements CommandLineRunner {

    @Autowired
    private Apple apple;

	public static void main(String[] args) {


		SpringApplication.run(IntroductionToSpringBoot1Application.class, args);
	}

    @Override
    public void run(String... args) throws Exception {

        apple.getApple();

    }
}
