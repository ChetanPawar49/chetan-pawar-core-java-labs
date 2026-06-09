package com.chetan.lab6.ex6;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class Exercise6 {
	
	public static List<Integer> votersList(HashMap<Integer, LocalDate> hm) {
		List<Integer> result = new ArrayList<>();
		
		for(Map.Entry<Integer, LocalDate> entry: hm.entrySet()) {
			int id = entry.getKey();
			LocalDate dob = entry.getValue();
			LocalDate today = LocalDate.now();
			
			int age = Period.between(dob, today).getYears();
			
			if(age > 18) {
				result.add(id);
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of persons: ");
		int len = sc.nextInt();
		
		HashMap<Integer, LocalDate> hm = new HashMap<>();
		for(int i=0; i<len; i++) {
			System.out.print("Enter person ID: ");
			int id = sc.nextInt();
			
			sc.nextLine();
			System.out.print("Enter person date of birth (yyyy-MM-dd): ");
			String input = sc.nextLine();
			LocalDate dob = LocalDate.parse(input);
			
			hm.put(id, dob);
		}
		
		List<Integer> result = Exercise6.votersList(hm);
		System.out.println("ID's of all people eligible to vote: ");
		for(int id: result) {
			System.out.println(id + " ");
		}
		
		sc.close();
	}

}
