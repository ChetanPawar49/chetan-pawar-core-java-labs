package com.chetan.lab6.ex3;

import java.util.*;

public class Exercise3 {
	
	public static Map<Integer, Integer> getSquares(int[] arr, int len) {
		Map<Integer, Integer> hm = new HashMap<>();
		
		for(int i=0; i<len; i++) {
			hm.put(arr[i], arr[i] * arr[i]);
		}
		
		return hm;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter length of an array: ");
		int len = sc.nextInt();
		
		int[] arr = new int[len];
		System.out.print("Enter array elements: ");
		for(int i=0; i<len; i++) {
			arr[i] = sc.nextInt();
		}
		
		Map<Integer, Integer> hm = Exercise3.getSquares(arr, len);
		
		System.out.println("Number and its squares: ");
		for(Map.Entry<Integer, Integer> entry: hm.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		sc.close();
	}

}
