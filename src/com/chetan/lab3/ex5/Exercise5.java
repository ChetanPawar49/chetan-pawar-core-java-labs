package com.chetan.lab3.ex5;

import java.util.*;

public class Exercise5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter text (type END on a new line to finish): ");
		StringBuffer sb = new StringBuffer();
		int lineCount = 0;
		
//		String output = Exercise5.getImage(input);
//		System.out.println("Output = " + output);
		
		while(true) {
			String line = sc.nextLine();
			
			if(line.equals("END")) {
				break;
			}
			
			sb.append(line).append('\n');
			lineCount++;
		}
		
		String text = sb.toString();
		
		int characterCount = text.length();
		characterCount -= lineCount;
		int wordCount = 0;
		
		String trimmedText = text.trim();
		wordCount = trimmedText.isEmpty() ? 0 : trimmedText.split("\\s+").length;
		
		System.out.println("Number of characters in given text are: " + characterCount);
		System.out.println("Number of words in given text are: " + wordCount);
		System.out.println("Number of lines in given text are: " + lineCount);
		
		sc.close();
	}

}
