package com.chetan.lab3.ex3;

import java.util.*;

public class Exercise3 {
	
	public static boolean isConsonant(char ch) {
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return false;
		}
		
		return true;
	}
	
	public static String alterString(String input) {
		StringBuilder sb = new StringBuilder();
		
		for(char ch: input.toCharArray()) {
			if(isConsonant(ch)) {
				ch = (char) (ch + 1);
			}
			
			sb.append(ch);
		}
		
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String input = sc.next();
		
		String output = Exercise3.alterString(input);
		System.out.println("Output = " + output);
		
		sc.close();
	}

}
