package com.chetan.lab6.ex1;

import java.util.*;

public class Exercise1 {
	
	public static List<Integer> getValues(HashMap<Integer, Integer> hm) {
		List<Integer> ans = new ArrayList<>(hm.values());
		
		Collections.sort(ans);
		
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		System.out.print("Enter the number of elements you want to insert in hashmap: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.print("Enter Key: ");
			int key = sc.nextInt();
			
			System.out.print("Enter Value: ");
			int value = sc.nextInt();
			
			hm.put(key, value);
		}
		
		List<Integer> ls = Exercise1.getValues(hm);
		
		System.out.println("Values of a HashMap in sorted order");
		for(int val: ls) {
			System.out.print(val + " ");
		}
		
		sc.close();
	}

}
