package com.practice.array;

public class FinalArrayExample {
	public static void main(String[] args) {

		// Example 1 - modifying element of final array
		int[] arr = { 10, 20, 30 };
		arr[1] = 99;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
