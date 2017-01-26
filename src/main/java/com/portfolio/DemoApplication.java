package com.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.portfolio.service.LoggerService;




@SpringBootApplication(scanBasePackageClasses = {DemoApplication.class, com.portfolio.configuration.AppConfiguration.class})

//@SpringBootApplication
public class DemoApplication {
	
	

	public static void main(String[] args) {
		
				
		SpringApplication.run(DemoApplication.class, args);
		
	}
}
