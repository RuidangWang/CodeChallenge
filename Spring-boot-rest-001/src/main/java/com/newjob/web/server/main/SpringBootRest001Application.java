package com.newjob.web.server.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.newjob"})
public class SpringBootRest001Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRest001Application.class, args);
	}

}
