package com.chetan.lab2.ex2;

import java.util.*;

public class Exercise2 {
	
	public static void sortStrings(String[] arr, int n) {
//		Arrays.sort(arr);
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-1; j++) {
				if(arr[j].compareTo(arr[j+1]) > 0) {
					String temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		int half = 0;
		if(n % 2 == 0) {
			half = n / 2;
		} else {
			half = (n / 2) + 1;
		}
		
		for(int i=0; i<half; i++) {
			arr[i] = arr[i].toUpperCase();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of an array: ");
		int n = sc.nextInt();
		
		String[] arr = new String[n];
		
		System.out.print("Enter strings: ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.next();
		}
		
		Exercise2.sortStrings(arr, n);
		
		for(String str: arr) {
			System.out.print(str + " ");
		}
		
		sc.close();
	}

}
