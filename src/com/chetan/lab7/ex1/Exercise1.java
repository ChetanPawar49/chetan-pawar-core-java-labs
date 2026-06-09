package com.chetan.lab7.ex1;

import java.util.*;

import com.cg.eis.service.EmployeeService;
import com.cg.eis.bean.Employee;
import com.cg.eis.pl.EmployeeServiceImpl;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		EmployeeService service = new EmployeeServiceImpl();
		
		while(true) {
			System.out.println("\n1. Add Employee");
            System.out.println("2. Display Employees By Insurance Scheme");
            System.out.println("3. Delete Employee");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            
            switch(choice) {
            	case 1: 
            		System.out.print("Enter Employee ID: ");
		            int id = sc.nextInt();
		            sc.nextLine();
		
		            System.out.print("Enter Employee Name: ");
		            String name = sc.nextLine();
		
		            System.out.print("Enter Salary: ");
		            double salary = sc.nextDouble();
		            sc.nextLine();
		
		            System.out.print("Enter Designation: ");
		            String designation = sc.nextLine();
		            
		            String scheme = service.getInsuranceScheme(salary, designation);
		            
		            Employee emp = new Employee(id, name, salary, designation, scheme);
		            
		            service.addEmployee(emp);
		            
		            System.out.println("Employee Added Successfully");
	                System.out.println("Assigned Scheme: " + scheme);

	                break;
	                
            	case 2: 
            		sc.nextLine();

                    System.out.print("Enter Insurance Scheme: ");
                    String insuranceScheme = sc.nextLine();

                    service.displayEmployeesByScheme(
                            insuranceScheme);

                    break;
                    
            	case 3: 
            		System.out.print("Enter Employee ID to delete: ");
                    int empId = sc.nextInt();

                    service.deleteEmployee(empId);

                    break;
                    
            	case 4:
            		System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                    
                    break;
                    
                default: 
                	System.out.println("Invalid Choice");
            }

		}
	}

}
