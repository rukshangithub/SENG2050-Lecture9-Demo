package com.example.demo.dtos;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;


@Data
public class RegisterEmployeeRequest {
    @NotNull
    private Integer id;
    
    @NotBlank(message = "Name is required")
    private String name;

    @Positive (message = "Salary must be postive.")
    private double salary;
}
