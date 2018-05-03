package com.biznomy.parent.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biznomy.parent.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
