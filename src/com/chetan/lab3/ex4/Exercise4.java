package com.chetan.lab3.ex4;

import java.util.*;

public class Exercise4 {
	public static String modifyNumber(String input) {
		int len = input.length();
		StringBuffer sb = new StringBuffer();

		for(int i=0; i<len-1; i++) {
			char ch = input.charAt(i);
			int num = Integer.parseInt(String.valueOf(ch));
			int nextNum = Integer.parseInt(String.valueOf(input.charAt(i+1)));
			
			num = Math.abs(num - nextNum);
			sb.append(num);
		}
		
		sb.append(input.charAt(len-1));
		
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String input = sc.next();
		
		String output = Exercise4.modifyNumber(input);
		System.out.println("Output = " + output);
		
		sc.close();
	}

}
