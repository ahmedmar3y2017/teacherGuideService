package com.example.demo.Repositories;

import com.example.demo.Entities.Employee;
import org.springframework.data.repository.CrudRepository;

public interface employeeRepo extends CrudRepository<Employee, Integer> {
    Employee findByName(String name);
}
