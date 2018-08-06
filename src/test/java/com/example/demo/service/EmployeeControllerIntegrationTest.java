package com.example.demo.service;


import com.example.demo.Controllers.employeeConroller;
import com.example.demo.Entities.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.servlet.ModelAndView;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class EmployeeControllerIntegrationTest {

    @Autowired
    employeeConroller employeeConroller;

    @Test
    public void testAddEmployeeControllerSuccess() {

        Employee aContact = new Employee();
        aContact.setName("eslam");


        // POST our Employee form bean to the controller; check the outcome
        String outcome = employeeConroller.AddEmployee(aContact);

        // Assert THAT the outcome is as expected
        assertThat(outcome, is(equalTo("success")));
    }

    @Test
    public void testAddEmployeeControllerFailure() {

        Employee aContact = new Employee();


        // POST our Employee form bean to the controller; check the outcome
        String outcome = employeeConroller.AddEmployee(aContact);

        // Assert THAT the outcome is as expected
        assertThat(outcome, is(equalTo("failure")));
    }


}
