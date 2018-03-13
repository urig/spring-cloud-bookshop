package com.example.inventory;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner getInit(BookRepository bookRepository) {
		return (args) -> bookRepository.save(new Book(1, "Moby Dick", "Herman Melville", new BigDecimal(30), 10));
	}
}
