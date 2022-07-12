package com.project.PayrollManagementSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.project.PayrollManagementSystem")
public class PayrollManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(PayrollManagementSystemApplication.class, args);
	}

}
