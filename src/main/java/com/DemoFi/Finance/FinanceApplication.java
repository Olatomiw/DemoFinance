package com.DemoFi.Finance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FinanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinanceApplication.class, args);
		System.out.println("DB_URL = " + System.getenv("DB_URL"));
		System.out.println("DB_USER = " + System.getenv("DB_USERNAME"));
		System.out.println("DB_PASSWORD = " + System.getenv("DB_PASSWORD"));
	}

}
