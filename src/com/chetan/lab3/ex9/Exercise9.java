package com.chetan.lab3.ex9;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class Exercise9 {
	
	public static void getDuration(LocalDate pastDate) {
		LocalDate currentDate = LocalDate.now();
		
		Period diff = Period.between(pastDate, currentDate);
		
		System.out.println("Duration in days, months and years relative to the current date is: ");
		System.out.println("Days: " + diff.getDays());
		System.out.println("Months: " + diff.getMonths());
		System.out.println("Years: " + Math.abs(diff.getYears()));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter date (yyyy-MM-dd): ");
		String input = sc.nextLine();
		LocalDate date = LocalDate.parse(input);
		
		Exercise9.getDuration(date);
		
		sc.close();
	}

}
