package com.example.demo.service;


import com.example.demo.Entities.Employee;
import com.example.demo.Repositories.employeeRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class EmployeeRepoTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    employeeRepo employeeRepo;

    @Test
    public void testFindByEmail() {


        Employee employee = new Employee();
        employee.setName("ahmed mohamed mar3y");

        // save test data
        entityManager.persist(employee);
        Employee employee1 = employeeRepo.findByName("ahmed mohamed mar3y");


        assertThat(employee.getName(), is(equalTo("ahmed mohamed mar3y")));


    }


}
