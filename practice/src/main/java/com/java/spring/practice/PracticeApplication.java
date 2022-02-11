package com.java.spring.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticeApplication {

	public static void main(String[] args) {
		System.out.println("************** Starting Spring Boot Application **************");
		SpringApplication.run(PracticeApplication.class, args);
	}

}
