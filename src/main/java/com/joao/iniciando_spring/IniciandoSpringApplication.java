package com.joao.iniciando_spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.joao.iniciando_spring.model.Course;
import com.joao.iniciando_spring.repository.CourseRepository;

@SpringBootApplication
public class IniciandoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(IniciandoSpringApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(CourseRepository courseRepository) {
		return args -> {
			courseRepository.deleteAll();

			Course c = new Course();
			c.setName("Angular básico");
			c.setCategory("Front End");

			courseRepository.save(c);
		};
	}

}
