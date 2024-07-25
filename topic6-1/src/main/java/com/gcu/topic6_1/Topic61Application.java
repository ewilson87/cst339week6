package com.gcu.topic6_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
//import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@SpringBootApplication
@ComponentScan({ "com.gcu" })
//@EnableJdbcRepositories("com.gcu.data.repository")
@EnableMongoRepositories(basePackages = "com.gcu.data.repository")
public class Topic61Application {

	public static void main(String[] args) {
		SpringApplication.run(Topic61Application.class, args);
	}

}
