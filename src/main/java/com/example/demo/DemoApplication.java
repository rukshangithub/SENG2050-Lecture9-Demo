package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.entities.Department;
import com.example.demo.entities.Employee;
import com.example.demo.entities.Project;
import com.example.demo.repositories.EmployeeRepository;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
/* 		var repository = context.getBean(EmployeeRepository.class);

		var employee = Employee.builder()
							.name("Peter Wang")
							.salary(100000)
							.build();
		repository.save(employee); //Saves employee

		// Finding the employee
		int empId = 5;
		if (repository.findById(empId).isPresent())
		{
			var emp = repository.findById(empId).orElseThrow();
			System.out.println("Employee: " + emp.getName());
			
		}
		else
			System.out.println("Employee with employee id: " + empId + " is not found.");
		
		// Delete the employee
		repository.deleteById(empId);

*/
/* 		var employee = Employee.builder()
							.name("Peter Wang")
							.salary(100000)
							.build();

		var project = Project.builder()
							.title("New Campaign for Xmas")
							.budget(25000)
							.build();

		employee.addProject(project);

		System.out.println(employee);
		System.out.println(project);

*/
		// var department = Department.builder()
		// 					.name("Marketing")
		// 					.build();

		// // Adding an employee to department						
		// department.addEmployee(employee);
		// System.out.println(department);
		
		// department.removeEmployee(employee);
		// System.out.println(department);


		// department.getEmployees().add(employee);
		// employee.setDepartment(department);
	
		// System.out.println("Employee id: " + employee.getId());
		// System.out.println("Employee name: " + employee.getName());
		// System.out.println("Employee salary: " + employee.getSalary());


		// department.getEmployees().add(employee);
		// employee.setDepartment(department);
//		department.addEmployee(employee);
					
		// // Removing an employee from the department
		// department.removeEmployee(employee);
		// System.out.println(department);

		// department.removeEmployee(employee);
		// System.out.println(department);
		// System.out.println(employee);

	}
}

					
