package com.example.ej5.commandlinerunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
	@SpringBootApplication
	public class Main {

		@Bean
		CommandLineRunner ClaseInicial1()
		{
			return p ->
			{
				System.out.println("Hola desde clase inical");
			};
		}
	}
}
