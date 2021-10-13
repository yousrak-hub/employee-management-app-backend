package com.practice.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.practice.springboot.model.Employee;
import com.practice.springboot.repository.EmployeeRepository;

@SpringBootApplication
public class EmployeeAppBackendApplication {

	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(EmployeeAppBackendApplication.class, args);

	}

//	@Bean
//	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//		return args -> {
//
//			System.out.println("Let's inspect the beans provided by Spring Boot:");
//
//			employeeRepository.save(new Employee("yousra", "kennou", "yousra_kennou@yahoo.com"));
//			employeeRepository.save(new Employee("nesrine", "kennou", "nesrine_kennou@yahoo.com"));
//
//		};
//	}
}
