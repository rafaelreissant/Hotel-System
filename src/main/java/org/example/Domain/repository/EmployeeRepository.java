package org.example.Domain.repository;

import org.example.Domain.entity.Employee;

import java.util.HashMap;
import java.util.Map;

public class EmployeeRepository {
    private static final Map<String, Employee> employees = new HashMap<>();

    public void addEmployee(Employee employee, String name){
        if (employees.containsValue(employees.get(name))){
            throw new RuntimeException("Name already in use");
        }
        employees.put(employee.getUsername(), employee);
        System.out.println("Employee added with success");
    }

    public Employee searchEmployee(String employee){
        return employees.get(employee);
    }

    public boolean authenticateEmployee(String name, String password){
        Employee employee = employees.get(name);
        if (employees.containsValue(employees.get(name))){
            throw new RuntimeException("Employee already created");
        }
        if (employees.containsValue(employees.get(password))){
            throw new RuntimeException("Employee already created");
        }
        return employee != null && employee.getPassword().equals(password);
    }
}
