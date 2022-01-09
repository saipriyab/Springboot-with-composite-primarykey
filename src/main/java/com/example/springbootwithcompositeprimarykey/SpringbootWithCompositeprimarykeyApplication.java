package com.example.springbootwithcompositeprimarykey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootwithcompositeprimarykey.entity.Employee;
import com.example.springbootwithcompositeprimarykey.entity.EmployeePKId;
import com.example.springbootwithcompositeprimarykey.repository.EmployeeRepository;

@SpringBootApplication
@RestController
@RequestMapping("/employee")
public class SpringbootWithCompositeprimarykeyApplication {

	@Autowired
	private EmployeeRepository employeeRepository;

	@PostMapping
	public Employee saveEmployee() {
		return employeeRepository.save(new Employee(new EmployeePKId(1,2),"abc","0123456789","abc@gmail.com"));
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWithCompositeprimarykeyApplication.class, args);
	}

}
