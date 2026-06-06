package com.chetan.lab1.ex3;

import java.util.*;

public class Exercise3 {
	
	public static int recursiveFibonnaciNumber(int n1, int n2, int ind, int n) {
		if(n == 1 || n == 2) {
			return 1;
		}
		
		if(ind == n) {
			return n1 + n2;
		}
		
		int ans = n1 + n2;
		return recursiveFibonnaciNumber(ans, n1, ind+1, n);
	}

	public static int fibonnaciNumber(int n) {
		if(n == 1 || n == 2) {
			return 1;
		}
		
		int n1 = 1;
		int n2 = 1;
		int ans = n1 + n2;
		
		for(int i=3; i<=n; i++) {
			ans = n1 + n2;
			n2 = n1;
			n1 = ans;
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
		int ans1 = Exercise3.recursiveFibonnaciNumber(1, 1, 3, n);
		int ans2 = fibonnaciNumber(n);
		
		System.out.println("Recursive solution answer: " + ans1);
		System.out.println("Iterative solution answer: " + ans2);
		
		sc.close();
	}

}
