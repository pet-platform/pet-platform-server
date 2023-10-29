package com.project.petkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class PetKinProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetKinProjectApplication.class, args);
	}

}
