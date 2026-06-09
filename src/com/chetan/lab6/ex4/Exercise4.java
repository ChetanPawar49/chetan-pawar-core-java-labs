package com.chetan.lab6.ex4;

import java.util.*;

public class Exercise4 {
	
	public static HashMap<Integer, String> getStudents(HashMap<Integer, Integer> hm) {
		HashMap<Integer, String> result = new HashMap<>();
		
		for(Map.Entry<Integer, Integer> entry: hm.entrySet()) {
			int registrationNumber = entry.getKey();
			int marks = entry.getValue();
			String medal = "";
			
			if(marks >= 90) {
				medal = "Gold";
			} else if(marks >= 80 && marks < 90) {
				medal = "Silver";
			} else if(marks >= 70 && marks < 80) {
				medal = "Bronze";
			}
			
			if(!medal.isEmpty()) {				
				result.put(registrationNumber, medal);
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of students: ");
		int noOfStudents = sc.nextInt();
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i=0; i<noOfStudents; i++) {			
			System.out.print("Enter registration number of student: ");
			int registrationNumber = sc.nextInt();
			
			System.out.print("Enter marks of student: ");
			int marks = sc.nextInt();
			
			hm.put(registrationNumber, marks);
		}
		
		HashMap<Integer, String> result = Exercise4.getStudents(hm);
		
		System.out.println("All medal-eligible students are: ");
		for(Map.Entry<Integer, String> entry: result.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		sc.close();
	}

}
