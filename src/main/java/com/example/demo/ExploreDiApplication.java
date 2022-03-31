package com.example.demo;//base component

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
@EnableSwagger2
@SpringBootApplication(scanBasePackages = {"com.example"})
public class ExploreDiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExploreDiApplication.class, args);
	}

}
