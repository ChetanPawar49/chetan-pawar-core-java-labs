package com.chetan.lab3.ex1;

import java.util.*;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter integers seperated by spaces: ");
		String input = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(input);
		
		int sum = 0;
		
		System.out.println("Integers entered are: ");
		while(st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());
			System.out.println(num);
			sum += num;
		}
		
		System.out.println("Sum = " + sum);
		
		sc.close();
	}

}
