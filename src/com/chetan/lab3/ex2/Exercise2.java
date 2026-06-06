package com.chetan.lab3.ex2;

import java.util.*;

public class Exercise2 {
	
	public static String getImage(String input) {
		String output = input;
		
		StringBuffer sb = new StringBuffer(input);
		String reverse = sb.reverse().toString();
		
		output += "|" + reverse;
		
		return output;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String input = sc.next();
		
		String output = Exercise2.getImage(input);
		System.out.println("Output = " + output);
		
		sc.close();
	}

}
