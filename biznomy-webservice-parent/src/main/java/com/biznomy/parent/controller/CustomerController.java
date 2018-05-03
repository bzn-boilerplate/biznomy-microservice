package com.biznomy.parent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biznomy.parent.model.Customer;
import com.biznomy.parent.repository.CustomerRepository;

@RestController
@RequestMapping(value="customer")
public class CustomerController {
	
	@Autowired
	CustomerRepository customerRepository; 
	
	@GetMapping(value="")
	private List<Customer> findAll(){		
		return customerRepository.findAll();		
	}

}
