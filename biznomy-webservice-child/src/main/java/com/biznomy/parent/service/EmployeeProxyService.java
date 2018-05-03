package com.biznomy.parent.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.biznomy.parent.model.Employee;

@FeignClient(name="biznomy-service-parent")
@RibbonClient(name="biznomy-service-parent")
public interface EmployeeProxyService {
	
	@GetMapping(value="employee") 
	public List<Employee> findAll();	

}
