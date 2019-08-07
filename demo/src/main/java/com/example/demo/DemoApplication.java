package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.EntrepriseRepository;
import com.example.demo.entities.AutoEntreprise;
import com.example.demo.entities.Sas;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
	@Autowired
	private EntrepriseRepository entrepriseRepository;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		entrepriseRepository.save(new AutoEntreprise(1111L, "AE1"));
		entrepriseRepository.save(new Sas(2222L, "Sas1","Adress1"));
		
	}

}
