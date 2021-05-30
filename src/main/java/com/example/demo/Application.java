package com.example.demo;

import java.io.File;
import java.io.IOException;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.Main1;
import com.example.demo.service.Main1ServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@Bean
	CommandLineRunner runner(Main1ServiceImpl main1Service) {
		return args -> {
			// read json and write to db
			ObjectMapper mapper = new ObjectMapper();
			try {
				Main1 users = mapper.readValue(new File("src/main/resources/Bath&Bristol_Sample.json"),Main1.class);
				main1Service.save(users);
				System.out.println("Users Saved!");
			} catch (IOException e){
				System.out.println("Unable to save users: " + e.getMessage());
			}
		};
	}
}
