package com.biznomy.parent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biznomy.parent.model.Employee;
import com.biznomy.parent.service.EmployeeProxyService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeProxyService employeeService; 
	
	@GetMapping(value="employee")
	private List<Employee> findAll(){
		return employeeService.findAll();
	}
}
