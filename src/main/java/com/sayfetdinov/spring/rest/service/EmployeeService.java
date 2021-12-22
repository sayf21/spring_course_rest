package com.sayfetdinov.spring.rest.service;

import com.sayfetdinov.spring.rest.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public Employee deleteEmployee(int id);
}
