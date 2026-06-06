package com.chetan.lab3.ex8;

import java.util.*;

public class Exercise8 {
	
	public static boolean checkPositiveString(String input) {
		int len = input.length();
		
		for(int i=1; i<len; i++) {
			char ch = input.charAt(i);
			char prevCh = input.charAt(i-1);
			
			if(ch > prevCh) {
				continue;
			} else {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String input = sc.next();
		
		boolean output = Exercise8.checkPositiveString(input);
		if(output) {
			System.out.println("The given string " + input + " is a positive string");
		} else {
			System.out.println("The given string " + input + " is not a positive string");
		}
		
		sc.close();
	}

}
