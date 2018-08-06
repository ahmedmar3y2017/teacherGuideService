package com.example.demo.Controllers;


import com.example.demo.Entities.Employee;
import com.example.demo.Service.employeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/employeeController")
public class employeeConroller {

    @Autowired
    employeeService service;


    @RequestMapping(method = RequestMethod.POST)
    public String AddEmployee(@RequestBody Employee employee) {


        Employee employee1 = service.addEmpoyee(employee);

        if (employee1 != null) {

            return "success";


        } else {
            return "failure";
        }


    }


}
