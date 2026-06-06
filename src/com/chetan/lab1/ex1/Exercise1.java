package com.chetan.lab1.ex1;

import java.util.*;

public class Exercise1 {
	
	public static int sumOfCubes(int num) {
		int sum = 0;
		
		while(num > 0) {
			int digit = num % 10;
			num = num / 10;
			
			int cube = digit * digit * digit;
			sum += cube;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		int ans = Exercise1.sumOfCubes(num);
		System.out.println("Sum of the cubes of the digits of " + num + " is: " + ans);
		
		sc.close();
	}

}
