package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.entity.Employee;
import com.crud.service.EmployeeService;

import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "CRUD Operations")
@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/employee")
	public ResponseEntity<String> saveEmployee(@RequestBody Employee employee) {

		String saveEmployee = employeeService.saveEmployee(employee);

		return new ResponseEntity<>(saveEmployee, HttpStatus.CREATED);
	}

	@GetMapping("/employee")
	public ResponseEntity<List<Employee>> getAllEmployee() {

		List<Employee> allEmployee = employeeService.getAllEmployee();

		return new ResponseEntity<>(allEmployee, HttpStatus.OK);
	}

	@GetMapping("/employee/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Integer id) {

		Employee employee = employeeService.getEmployeeById(id);
		
		return new ResponseEntity<>(employee, HttpStatus.OK);
	}

}
