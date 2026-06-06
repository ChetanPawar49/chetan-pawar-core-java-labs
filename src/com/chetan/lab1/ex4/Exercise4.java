package com.chetan.lab1.ex4;

import java.util.*;

public class Exercise4 {
	
	public static void primeNumbers(int n) {
		for(int i=2; i<=n; i++) {
			int num = i;
			boolean flag = true;
			
			for(int j=2; j<=num/2; j++) {
				if(num % j == 0) {
					flag = false;
					break;
				}
			}
			
			if(flag) {
				System.out.print(num + " ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
		System.out.println("All prime numbers upto " + n + " are: ");
		Exercise4.primeNumbers(n);
		
		sc.close();
	}

}
