package com.di.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiApplication implements CommandLineRunner {

	@Autowired
	private Dev dev;

	@Autowired
	private India india;



	public static void main(String[] args) {

		SpringApplication.run(DiApplication.class, args);
	}

	public void run(String... args){
		dev.disp();
		india.nature();


	}


}
