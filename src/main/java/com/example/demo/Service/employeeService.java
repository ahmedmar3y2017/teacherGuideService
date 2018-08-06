package com.example.demo.Service;

import com.example.demo.Entities.Employee;
import com.example.demo.Repositories.employeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class employeeService {

    @Autowired
    employeeRepo employeeRepo;


    public Employee addEmpoyee(Employee employee) {

        Employee employee1 = null;



        if (employee.getName() != null) {

            System.out.println("nams is : "+employee.getName());

            employee1 = employeeRepo.save(employee);

        }


        return employee1;

    }


}
