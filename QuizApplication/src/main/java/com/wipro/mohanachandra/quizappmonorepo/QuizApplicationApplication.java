package com.wipro.mohanachandra.quizappmonorepo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.wipro.mohanachandra.quizappmonorepo") 
@EnableJpaRepositories(basePackages = "com.wipro.mohanachandra.quizappmonorepo.repository") 
@EntityScan(basePackages = "com.wipro.mohanachandra.quizappmonorepo.entities") 
public class QuizApplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizApplicationApplication.class, args);
	}

}
