package com.example.demo;

import com.example.demo.Entities.Employee;
import com.example.demo.Service.employeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.Collections;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {

        // Create a contact
//        Employee aContact = new Employee();
//        aContact.setName("Jenny");
//
//
//        // Test adding the contact
//        Employee employee = service.addEmpoyee(aContact);
//
//        System.out.println(employee.getId() + "   " +employee.getName());

    }

}
