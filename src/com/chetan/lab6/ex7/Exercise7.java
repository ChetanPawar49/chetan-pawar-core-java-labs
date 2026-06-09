package com.chetan.lab6.ex7;

import java.util.*;

public class Exercise7 {
	
	public static int reverseNumber(int num) {		
		String st = String.valueOf(num);
		StringBuffer sb = new StringBuffer(st);
		String reverseString = sb.reverse().toString();
		
		int reverse = Integer.parseInt(reverseString);
		
		return reverse;
	}
	
	public static int[] getSorted(int[] arr) {
		int len = arr.length;
		int[] result = new int[len];
		
		for(int i=0; i<len; i++) {
			int reverse = reverseNumber(arr[i]);
			result[i] = reverse;
		}
		
		Arrays.sort(result);
		
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of an array: ");
		int len = sc.nextInt();
		
		int[] arr = new int[len];
		System.out.print("Enter array elements: ");
		for(int i=0; i<len; i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] result = Exercise7.getSorted(arr);
		
		System.out.println("Array elements after reversing and sorting are: ");
		for(int i=0; i<len; i++) {
			System.out.print(result[i] + " ");
		}
		
		sc.close();
	}

}
