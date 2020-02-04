package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringboottestApplication {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext  context= SpringApplication.run(SpringboottestApplication.class, args);
		
		Alian a= context.getBean(Alian.class);
		a.show();
	}

}
