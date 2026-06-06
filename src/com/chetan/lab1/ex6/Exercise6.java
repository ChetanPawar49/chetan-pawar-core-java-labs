package com.chetan.lab1.ex6;

import java.util.*;

public class Exercise6 {
	
	public static int calculateDifference(int n) {
		int sumOfNumbers = (n * (n + 1)) / 2;
		int sumOfSquares = (n * (n + 1) * (2 * n + 1)) / 6;
		
		int square = sumOfNumbers * sumOfNumbers;
		
		int difference = sumOfSquares - square;
		return difference;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
		int ans = Exercise6.calculateDifference(n);
		System.out.println("difference between the sum of squares and the square of the sum of the first " + n + " natural numbers is: " + ans);
		
		sc.close();
	}

}
