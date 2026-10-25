package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// SpringApplication.run(DemoApplication.class, args);

		Candidate candidate1 = new Candidate("C1", "Nguyen","Nguyen@012",54564615);
		candidate1.sendNotifiable("Chuc Mung Ban");
	}

}
