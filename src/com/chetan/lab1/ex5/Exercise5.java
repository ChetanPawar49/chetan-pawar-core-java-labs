package com.chetan.lab1.ex5;

import java.util.*;

public class Exercise5 {
	
	public static int calculateSum(int n) {
		int sum = 0;
		
		for(int i=3; i<=n; i++) {
			if(i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
		int ans = Exercise5.calculateSum(n);
		System.out.println("Sum of first n natural numbers that are divisible by 3 or 5 is: " + ans);
		
		sc.close();
	}
	
}
