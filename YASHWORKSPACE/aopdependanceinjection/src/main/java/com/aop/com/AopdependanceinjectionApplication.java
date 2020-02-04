package com.aop.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AopdependanceinjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(AopdependanceinjectionApplication.class, args);
		Alian obj = context.getBean(Alian.class);
		Alian obj1=context.getBean(Alian.class);
		obj.show();
		obj1.show();
	}

}
