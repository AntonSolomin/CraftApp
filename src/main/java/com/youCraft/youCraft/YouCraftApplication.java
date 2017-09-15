package com.youCraft.youCraft;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class YouCraftApplication {

	public static void main(String[] args) {
	    SpringApplication.run(YouCraftApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(UserService userService) {
		return (args) -> {
            User user1 = new User("Anton", "Solomin", "ledorub", "123");
            userService.save(user1);
		};
	}

}
