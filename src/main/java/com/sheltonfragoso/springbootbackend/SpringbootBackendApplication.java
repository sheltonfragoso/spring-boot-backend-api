package com.sheltonfragoso.springbootbackend;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sheltonfragoso.springbootbackend.domain.Categoria;
import com.sheltonfragoso.springbootbackend.repositories.CategoriaRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");

		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
	}
}
