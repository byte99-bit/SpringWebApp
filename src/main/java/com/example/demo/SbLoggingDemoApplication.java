package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SbLoggingDemoApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(SbLoggingDemoApplication.class, args);
		
		UserService us=context.getBean(UserService.class);
		us.saveUser();
	}

}
