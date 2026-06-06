package com.chetan.lab1.ex7;

import java.util.*;

public class Exercise7 {
	
	public static boolean checkNumber(int num) {
		int prevDigit = 0;
		
		if(num > 0) {
			prevDigit = num % 10;			
			num = num / 10;
		}
		
		int currentDigit = 0;
		while(num > 0) {
			currentDigit = num % 10;
			num = num / 10;
			
			if(currentDigit > prevDigit) {
				return false;
			} else {
				prevDigit = currentDigit;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		boolean ans = Exercise7.checkNumber(num);
		if(ans) {
			System.out.println(num + " is an increasing number");
		} else {
			System.out.println(num + " is not an increasing number");
		}
		
		sc.close();
	}

}
