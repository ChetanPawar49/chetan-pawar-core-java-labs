package com.chetan.lab1.ex2;

import java.util.*;

public class Exercise2 {
	
	public static void trafficLightSimlation(int num) {
		if(num == 1) {
			System.out.println("stop");
		} else if(num == 2) {
			System.out.println("ready");
		} else if(num == 3) {
			System.out.println("Go");
		} else {
			System.out.println("Invalid Number!");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number between 1 to 3: ");
		int num = sc.nextInt();
		
		Exercise2.trafficLightSimlation(num);
		
		sc.close();
	}

}
