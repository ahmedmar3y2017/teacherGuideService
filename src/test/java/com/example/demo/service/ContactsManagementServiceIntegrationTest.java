package com.example.demo.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.example.demo.Entities.Employee;
import com.example.demo.Repositories.employeeRepo;
import com.example.demo.Service.employeeService;
import com.example.demo.WebService.EmplyeeWebService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;


@RunWith(SpringRunner.class)
@SpringBootTest()
public class ContactsManagementServiceIntegrationTest {

    @Mock
    private employeeRepo employeeRepo;


    @InjectMocks
    private employeeService service;


    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

    }


    @Test
    public void testAddContactHappyPath() {

        // Create a contact
        Employee aContact = new Employee();
        aContact.setName("ahmed");


        // Test adding the contact
//        Employee employee = service.addEmpoyee(aContact);
//
        Mockito.when(employeeRepo.save(Matchers.any(Employee.class))).thenReturn(aContact);

        Employee employee = service.addEmpoyee(aContact);


        assertEquals("ahmed", employee.getName());

//        // Verify the addition
//        assertNotNull(employee);
//        assertNotNull(employee.getId());
//        assertEquals("Jenny", employee.getName());

    }
}
