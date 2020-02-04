package com.yash.pta.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.yash.pta.web.UserControllerr;

/**
 * This is main class which starts the application.
 */
@SpringBootApplication
@EntityScan({"com.yash.pta.model"})
@EnableJpaRepositories("com.yash.pta.repository")
public class PracticeTestApplication {
	
	private final static Logger LOGGER = LoggerFactory.getLogger(UserControllerr.class.getName());
	
	public static void main(String[] args) {
		SpringApplication.run(PracticeTestApplication.class, args);
		LOGGER.info("\n\n*******Your application is started!********");
	}

}
