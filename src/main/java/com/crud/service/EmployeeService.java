package com.crud.service;

import java.util.List;

import com.crud.entity.Employee;

public interface EmployeeService {
	
	public String saveEmployee(Employee employee);
	
	public List<Employee> getAllEmployee();
	
	public Employee getEmployeeById(Integer id);

}
