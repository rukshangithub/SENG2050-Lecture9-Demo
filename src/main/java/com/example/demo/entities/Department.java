package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter 
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    // @OneToMany (mappedBy = "department")
    // @Builder.Default
    // private List<Employee> employees = new ArrayList<Employee>();

    // public void addEmployee(Employee employee)
    // {
    //     employees.add(employee);
    //     employee.setDepartment(this);
    // }

    // public void removeEmployee(Employee employee)
    // {
    //     employees.remove(employee);
    //     employee.setDepartment(null);   
    // }
}

