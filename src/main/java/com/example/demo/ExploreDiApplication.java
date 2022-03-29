package com.example.demo;//base component

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example"})
public class ExploreDiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExploreDiApplication.class, args);
	}

}
