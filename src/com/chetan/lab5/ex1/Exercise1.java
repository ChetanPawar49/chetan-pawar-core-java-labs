package com.chetan.lab5.ex1;

import java.util.*;

class InvalidAgeException extends Exception {
	private static final long serialVersionUID = 5169748807293375476L;

	public InvalidAgeException(String message) {
		super(message);
	}
}

public class Exercise1 {
	
	public static void validateAge(int age) throws InvalidAgeException {
		if(age < 15) {
			throw new InvalidAgeException("Age must be above 15");
		}
		
		System.out.println("Your age is valid");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter age of a person: ");
		int age = sc.nextInt();
		
		try {
			Exercise1.validateAge(age);
		} catch (InvalidAgeException e) {
			System.out.println("Invalid age: " + e.getMessage());
		}
		
		sc.close();
	}

}
