package com.example.compoundInterestCalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class CompoundInterestCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompoundInterestCalculatorApplication.class, args);
	}

}
