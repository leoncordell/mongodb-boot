package com.example.spring.mongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.spring.mongodb")
@Configuration
public class MongodbApplication {


	public static void main(String[] args) {
		SpringApplication.run(MongodbApplication.class, args);
	}


	// Notes
	// 1. C:/data/db directory needed to exist
	// 2.  Goto MonDB Compass comunity  from  start menu


}
