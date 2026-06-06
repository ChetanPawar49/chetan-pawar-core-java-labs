package com.chetan.lab2.ex3;

import java.util.*;

public class Exercise3 {
	
	public static void getSorted(int[] arr, int n) {
		for(int i=0; i<n; i++) {
			String str = String.valueOf(arr[i]);
			
			String reverse = new StringBuilder(str).reverse().toString();
			
			arr[i] = Integer.parseInt(reverse);
		}
		
		Arrays.sort(arr);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of an array: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.print("Enter array elements: ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Exercise3.getSorted(arr, n);
		
		System.out.print("Sorted Array: ");
		for(int num: arr) {
			System.out.print(num + " ");
		}
		
		sc.close();
	}

}
