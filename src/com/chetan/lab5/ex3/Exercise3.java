package com.chetan.lab5.ex3;

import com.cg.eis.exception.EmployeeException;

import java.util.*;

public class Exercise3 {
	
	public static void validateSalary(double salary) throws EmployeeException {
		if(salary < 3000) {
			throw new EmployeeException("Invalid! Salary of an employee cannot be less than 3000.");
		}
		
		System.out.println("Employee salary: " + salary);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter salary of an employee: ");
		double salary = sc.nextDouble();
		
		try {
			Exercise3.validateSalary(salary);
		} catch (EmployeeException e) {
			System.out.println(e);
		}
		
		sc.close();
	}

}
