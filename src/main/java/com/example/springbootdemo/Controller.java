package com.example.springbootdemo;

import com.example.springbootdemo.Entity.Employee;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    @GetMapping("/get")
    public ResponseEntity<List<Employee>> getAllEmployee(){
        List<Employee> employees=new ArrayList<>();
        employees.add(new Employee(1,"Aanshik","India"));
        employees.add(new Employee(2,"Golu","USA"));

        return new ResponseEntity<>(employees, HttpStatus.OK);
    }
}
