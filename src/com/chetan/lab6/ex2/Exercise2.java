package com.chetan.lab6.ex2;

import java.util.*;

public class Exercise2 {
	
	public static Map<Character, Integer> countChars(char[] arr, int len) {
		HashMap<Character, Integer> hm = new HashMap<>();
		
		for(int i=0; i<len; i++) {
			hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
		}
		
		return hm;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter length of array: ");
		int len = sc.nextInt();
		
		char[] arr = new char[len];
		System.out.print("Enter array elements (characters seperated by spaces): ");
		for(int i=0; i<len; i++) {
			String ch = sc.next();
			arr[i] = ch.charAt(0);
		}
		
		Map<Character, Integer> hm = Exercise2.countChars(arr, len);
		
		System.out.println("Occurrences of each character in the array");
		for(Map.Entry<Character, Integer> entry: hm.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		sc.close();
	}

}
