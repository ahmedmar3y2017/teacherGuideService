package com.example.demo.service;


import com.example.demo.Controllers.employeeConroller;
import com.example.demo.Entities.Employee;
import com.example.demo.Service.employeeService;
import javafx.beans.binding.When;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.mockito.*;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(SpringRunner.class)
@WebMvcTest(employeeConroller.class)
public class EmployeeControllerMockIntegrationTest {
    @Autowired
    MockMvc mockMvc;

    @MockBean
    employeeService service;

    @InjectMocks
    employeeConroller employeeConroller;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

    }

    @Test
    public void TestAddEmployeeController() throws Exception {

        Employee employee = new Employee();
        employee.setName("ahmed mohamed");

        Mockito.when(service.addEmpoyee(Matchers.any(Employee.class))).thenReturn(employee);


        Employee employee1 = new Employee();
        employee1.setName("ahmed mohamed");

        mockMvc.perform(MockMvcRequestBuilders.post("/employeeController", employee1)).
                andExpect(MockMvcResultMatchers.status().is(400)).andReturn();


    }


}
