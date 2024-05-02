package com.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.entity.Employee;
import com.crud.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public String saveEmployee(Employee employee) {
		
		if (employeeRepo.findById(employee.getId()).isPresent()) {
			return "Employee alredy exist";
		} else {
			Employee save = employeeRepo.save(employee);
			return "Employee saved successfully";
		}

	}

	@Override
	public List<Employee> getAllEmployee() {
		
		List<Employee> list = employeeRepo.findAll();
		return list;
	}

	@Override
	public Employee getEmployeeById(Integer id) {
		
		Employee employee = employeeRepo.findById(id).get();
		return employee;
	}

}
