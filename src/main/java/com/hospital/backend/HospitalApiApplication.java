package com.hospital.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableAsync;



@SpringBootApplication
@EnableJpaAuditing
@EnableAsync
public class HospitalApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalApiApplication.class, args);
	}

}
