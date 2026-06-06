package com.chetan.lab2.ex4;

import java.util.*;

public class Exercise4 {
	
	public static void reverse(int[] arr, int i, int j) {
		while(i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
	
	public static int[] modifyArray(int[] arr, int n) {
		HashSet<Integer> hs = new HashSet<>();
		
		for(int i=0; i<n; i++) {
			hs.add(arr[i]);
		}
		
		int size = hs.size();
		int[] newArray = new int[size];
		
		int ind = 0;
		for(int num: hs) {
			newArray[ind] = num;
			ind++;
		}
		
		Arrays.sort(newArray);
		reverse(newArray, 0, size-1);
		
		return newArray;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of an array: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.print("Enter array elements: ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] modifiedArray = Exercise4.modifyArray(arr, n);
		
		System.out.print("Modified Array: ");
		for(int num: modifiedArray) {
			System.out.print(num + " ");
		}
		
		sc.close();
	}

}
