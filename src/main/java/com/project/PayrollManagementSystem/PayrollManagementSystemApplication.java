package com.project.PayrollManagementSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@EnableConfigurationProperties
//@EntityScan(basePackages = {"com.project.PayrollManagementSystem.model"})
@ComponentScan("com.project.PayrollManagementSystem")
public class PayrollManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(PayrollManagementSystemApplication.class, args);
	}

}
