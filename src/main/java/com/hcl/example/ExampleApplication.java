package com.hcl.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExampleApplication {

	public static void main(String[] args) {
		System.out.println("Hello Dev-Ops");
		SpringApplication.run(ExampleApplication.class, args);
	}

}
