package com.monopoly.david;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.monopoly.david")
public class DavidApplication {

	public static void main(String[] args) {
		SpringApplication.run(DavidApplication.class, args);
	}

}
