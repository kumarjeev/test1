package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	String name="mike";
	boolean isPresent=false;
	int x=80;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
