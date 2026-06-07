package com.chetan.lab5.ex2;

import java.util.*;

class NameValidationException extends Exception {
	private static final long serialVersionUID = 1L;

	public NameValidationException(String message) {
		super(message);
	}
}

public class Exercise2 {
	
	public static void validateName(String firstName, String lastName) throws NameValidationException {
		if(firstName == null || firstName.trim().isEmpty()) {
			throw new NameValidationException("Invalid! first name cannot be blank.");
		}
		
		if(lastName == null || lastName.trim().isEmpty()) {
			throw new NameValidationException("Invalid! last name cannot be blank.");
		}
		
		System.out.println("Employee Name: " + firstName + " " + lastName);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first name: ");
		String firstName = sc.nextLine();
		
		System.out.print("Enter last name: ");
		String lastName = sc.nextLine();
		
		try {
			Exercise2.validateName(firstName, lastName);
		} catch (NameValidationException e) {
			System.out.println(e);
		}
		
		sc.close();
	}

}
