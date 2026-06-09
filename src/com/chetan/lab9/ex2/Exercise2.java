package com.chetan.lab9.ex2;

import java.util.*;

public class Exercise2 {
	
	public static boolean validateUserName(String username) {
		return username.matches(".{8,}_job");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter name: ");
		String username = sc.nextLine();
		
		boolean result = Exercise2.validateUserName(username);
		
		System.out.println(result);
		
		sc.close();
	}

}
