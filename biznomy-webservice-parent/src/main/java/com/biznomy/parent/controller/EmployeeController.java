package com.biznomy.parent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biznomy.parent.model.Employee;
import com.biznomy.parent.repository.EmployeeRepository;

@RestController
@RequestMapping(value="employee")
public class EmployeeController {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@GetMapping(value="")
	public List<Employee> findAll(){
		return employeeRepository.findAll();		
	}

}
