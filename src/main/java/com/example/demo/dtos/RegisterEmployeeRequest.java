package com.example.demo.dtos;


import lombok.Data;


@Data
public class RegisterEmployeeRequest {

    private Integer id;
    private String name;
    private double salary;
}
