package com.devsuperior.aula;

import com.devsuperior.aula.entities.Employee;
import com.devsuperior.aula.services.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AulaApplication implements CommandLineRunner {

	@Autowired
	private SalaryService salaryService;

//	public AulaApplication(SalaryService salaryService) {
//		this.salaryService = salaryService;
//	}

	public static void main(String[] args) {

		SpringApplication.run(AulaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee("Maria",4000);
		System.out.println(salaryService.netSalary(employee));

	}
}
