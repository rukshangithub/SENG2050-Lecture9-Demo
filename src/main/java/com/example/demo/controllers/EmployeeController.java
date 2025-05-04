package com.example.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import com.example.demo.DemoApplication;
import com.example.demo.dtos.EmployeeDto;
import com.example.demo.dtos.RegisterEmployeeRequest;
import com.example.demo.entities.Employee;
import com.example.demo.repositories.EmployeeRepository;

import lombok.AllArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@AllArgsConstructor
@RequestMapping("/employees")
public class EmployeeController /*~~(Could not parse as Java)~~>*/{

    private final DemoApplication demoApplication;
    
    private final EmployeeRepository employeeRepository;
/* 
    @GetMapping
    public Iterable<Employee> getAllEmployees()
    {
        return employeeRepository.findAll();
    }
        */
/*
    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable Integer id)
    {
        return employeeRepository.findById(id).orElse(null);

    }
 */

    @GetMapping
    public List<EmployeeDto> getAllEmployees(
        @RequestHeader(required = false, name = "x-auth-token") String authToken,
        @RequestParam(required = false, defaultValue="", name="param1") String parameter
    )
    {
        System.out.println("Authentication token:" + authToken);
        System.out.println("Parameter passed: " + parameter);
        return employeeRepository.findAll()
                        .stream()
                        .map(employee -> new EmployeeDto(employee.getId(),employee.getName()))
                        .toList();
    }

  /*  @PostMapping
    public EmployeeDto createEmployee(@RequestBody EmployeeDto employee) {
        return employee;
    }
    */

    @PostMapping
    public EmployeeDto createEmployee(@RequestBody RegisterEmployeeRequest  registerEmployee) {

        System.out.println("Inside createEmplotee method");
        Employee employee = new Employee(registerEmployee.getName(), registerEmployee.getSalary());
        var newEmployee = employeeRepository.save(employee);

        var employeeDto =  new EmployeeDto(newEmployee.getId(), newEmployee.getName());
        return employeeDto;
    }

/*
    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable Integer id)
    {
        var employee = employeeRepository.findById(id).orElse(null);
        if (employee == null)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Employee>(employee, HttpStatus.OK);
    }
 */


 @GetMapping("/{id}")
 public ResponseEntity<EmployeeDto> getEmployee(@PathVariable Integer id)
 {
     var employee = employeeRepository.findById(id).orElse(null);
     if (employee == null)
     {
         return new ResponseEntity<>(HttpStatus.NOT_FOUND);
     }
     return new ResponseEntity<EmployeeDto>(new EmployeeDto(employee.getId(), employee.getName()), HttpStatus.OK);
 }


}
