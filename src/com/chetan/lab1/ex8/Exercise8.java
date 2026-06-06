package com.chetan.lab1.ex8;

import java.util.*;

public class Exercise8 {
	
	public static boolean checkNumber(int num) {
		return num>0 && ((num & (num-1)) == 0);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		boolean ans = checkNumber(num);
		if(ans) {
			System.out.println(num + " is a power of 2");
		} else {
			System.out.println(num + " is not a power of 2");
		}
		
		sc.close();
	}

}
