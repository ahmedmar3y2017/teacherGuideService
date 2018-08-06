package com.example.demo;

import com.example.demo.service.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(Suite.class)
@Suite.SuiteClasses({DatastoreSystemsHealthTest.class, ContactsManagementServiceIntegrationTest.class,
        EmployeeControllerIntegrationTest.class, EmployeeControllerMockIntegrationTest.class
        , EmployeeRepoTest.class})
public class DemoApplicationTests {


}
