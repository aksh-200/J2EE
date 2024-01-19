package com.demo.service;

import java.util.List;

import com.demo.model.Employee;

public interface EmpService {

	List<Employee> findAllEmployee();

	void deleteById(int empid);

	Employee getById(int empid);

	void modify(Employee e);

	void add(Employee e);

	

	

	

}
