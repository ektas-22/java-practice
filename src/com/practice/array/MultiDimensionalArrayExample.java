package com.practice.array;

public class MultiDimensionalArrayExample {

	public static void main(String[] args) {

		// Syntax
		/*------------------------------------------------------------------------------   
		 * data_type[dim1][dim2]...[dimN] array_name=new data_type[size1][size2]...[sizeN];
		 --------------------------------------------------------------------------------*/

		// Example
		// Two dimensional array:
		// int[][] arr2d = new int[3][5];
		// Three dimensional array:
		// int[][][] arr3d = new int[3][5][7];

		// Size Calculation
		// Total elements=product of all dimension
		// example - ont[][][] x=new int[3][5][7];
		// 3x5x7 = 105 elements

		// 2D Array
		// data_type[][] array_name = new data_type[x][y];

		// array_name[row_index][col_index] = value;

		// Example 1
		int[][] arr1 = { { 1, 2 }, { 3, 4 } };
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}

		// Example 2
		int n = 2;
		int m = 2;

		int[][] arr2 = new int[n][m];

		int it = 1;
		// Assigning values to array
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr2[i][j] = it;
				it++;
			}
		}

		// Printing array
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}

		/*
		 * ----------------------------------------------------------------------------
		 * Note: In an array of size N, indices range from 0 to N - 1. Therefore, row
		 * index 2 corresponds to the third row.
		 * --------------------------------------------------------------------------
		 */
		
		
		
		//Accessing elements of array
		int[][] arr3 = {{1,2},{3,4}};
		System.out.println("Accessing "+arr3[0][1]);
	}
}
