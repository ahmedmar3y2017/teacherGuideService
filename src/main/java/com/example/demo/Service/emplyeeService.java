package com.example.demo.Service;

import com.example.demo.Entities.Employee;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/rest")
@Api(value = "Teach Guide Employee")
public class emplyeeService {


    // getAll
    @ApiOperation(value = "View a list of Employee", response = Employee.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved "),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    }
    )
    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public ResponseEntity<?> GetAll() {


        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(1,"Lokesh Gupta"));
        employeeList.add(new Employee(2,"ahmed mohamed"));

        return new ResponseEntity<>(employeeList, HttpStatus.OK);


    }
}
