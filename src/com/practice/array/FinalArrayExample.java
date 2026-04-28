package com.practice.array;

public class FinalArrayExample {

	int p = 20;

	public static void main(String[] args) {

		// Example 1 - modifying element of final array
		final int[] arr = { 10, 20, 30 };
		arr[1] = 99;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		// Example 2 - Modifying Object State Referenced by a Final Variable
		final FinalArrayExample f = new FinalArrayExample();
		f.p = 88;
		System.out.println(f.p);

		System.out.println();

		// Example 3 - compilation error while reassigning
		final FinalArrayExample f1 = new FinalArrayExample();
		FinalArrayExample f2 = new FinalArrayExample();
//		f1 = f2; // Compilation Error
		System.out.println(f1.p);

		System.out.println();

		// Example 4 - final array reference and reassignment
		final int[] arr2 = { 1, 2, 3, 4, 5 };
		int[] arr3 = { 10, 20, 30, 40, 50 };
		arr3 = arr2;
//		arr2 = arr3; // Compilation Error
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}

		System.out.println();

		// Example 5 - modifying elements in final array and attempting re-assigning
		final int[] numbers = { 1, 2, 3, 4, 5 };
		numbers[1] = 6;
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
}
