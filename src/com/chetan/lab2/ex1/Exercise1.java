package com.chetan.lab2.ex1;

import java.util.*;

public class Exercise1 {
	
	public static int getSecondSmallest(int[] arr, int n) {
		int min = Integer.MAX_VALUE;
		int secMin = Integer.MAX_VALUE;
		
		for(int i=0; i<n; i++) {
			if(arr[i] < min) {
				secMin = min;
				min = arr[i];
			} else if(arr[i] < secMin && arr[i] != min) {
				secMin = arr[i];
			}
		}
		
		return secMin;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of an array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.print("Enter elements of array: ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int ans = Exercise1.getSecondSmallest(arr, n);
		System.out.println("Second smallest element in array is: " + ans);
		
		sc.close();
	}

}
