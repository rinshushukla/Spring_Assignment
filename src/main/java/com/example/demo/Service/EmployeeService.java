package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Employee;

public interface EmployeeService {
	public List<Employee> getAllEmployee();

	public Employee addEmployee(Employee employee);

	public Employee findEmployeeById(int eid);

}
