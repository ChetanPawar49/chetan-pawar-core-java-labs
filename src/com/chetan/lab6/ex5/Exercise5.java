package com.chetan.lab6.ex5;

import java.util.*;

class ArrayLengthException extends Exception {
	private static final long serialVersionUID = 1L;

	public ArrayLengthException(String message) {
		super(message);
	}
}

public class Exercise5 {
	
	public static int getSecondSmallest(int[] arr) {
//		List<Integer> ls = Arrays.stream(arr).boxed().toList();
		
		ArrayList<Integer> ls = new ArrayList<>();
		for(int i: arr) {
			ls.add(i);
		}
		
		Collections.sort(ls);
		
		return ls.get(1);
	}

	public static void main(String[] args) throws ArrayLengthException {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of an array: ");
		int len = sc.nextInt();
		
		if(len < 2) {
			sc.close();
			throw new ArrayLengthException("To get second smallest element you have to atleast enter two elements.");
		}
		
		int[] arr = new int[len];
		System.out.print("Enter array elements: ");
		for(int i=0; i<len; i++) {
			arr[i] = sc.nextInt();
		}
		
		int result = Exercise5.getSecondSmallest(arr);
		
		System.out.println("second smallest element in array is: " + result);
		
		sc.close();
	}

}
