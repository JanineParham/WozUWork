package com.janine.day14;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.janine.day14.repo")
public class Day14Application {

	public static void main(String[] args) {
		SpringApplication.run(Day14Application.class, args);
	}

}
