package com.practice.array;

public class ArrayExample {
	
	public int id;
	public String name;
	
	ArrayExample(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	public static void main(String[] args) {

		// ARRAY DECLARATION
		/*-----------------------
		 * dataType[] arrayName;
		 * dataType arrayName[];
		 -------------------------*/

		// ARRAY INITIALIZATION
		/*-------------------------------------
		 * dataType arrayName[]=new dataType[size];
		 ------------------------------------------*/

		int[] arr = { 4, 2, 6, 8 };
		System.out.println("Array Length - " + arr.length);

		// OPERATION ON ARRAY ELEMENTS
		// Access Array Element
		int[] firstArray = { 55, 2, 6, 48, 25 };
		System.out.println(firstArray[4]);
		System.out.println(firstArray[2]);

		// Updating Array Element
		int[] secondArray = { 20, 41, 12, 90, 32, 50, 69 };
		System.out.println("Before updating elements - " + secondArray);
		secondArray[3] = 99;
		System.out.println("After updating elements - " + secondArray);

		// Traverse Array
		int[] thirdArray = { 20, 65, 20, 83, 21 };
		for (int i = 0; i < thirdArray.length; i++) {
			System.out.println("Traversing the array - " + thirdArray[i]);
		}

		// Size of Array
		int[] fourthArray = { 39, 72, 51, 79, 23, 80 };
		System.out.println("Size of the array - " + fourthArray.length);

		// Array of Object
		ArrayExample[] fifthArray;
		fifthArray=new ArrayExample[3];
		fifthArray[0]=new ArrayExample(1,"Hello");
		fifthArray[1]=new ArrayExample(2, "Array");
		fifthArray[2]=new ArrayExample(3,"Demo");
		for(int i=0;i<fifthArray.length;i++) {
			System.out.println("Array of Object - "+fifthArray[i]);
		}
		
		// Access Element Outside Array
		int[] sixtharray = { 40, 24, 50, 11, 61, 30 };
		System.out.println("Accessing outside index - " + sixtharray[6]);

		// Passing Array to Method

		// Returning Array from Method
	}

	public void passingArray(int[] arr) {

	}

	public int[] returnArray() {
		return new int[] { 50, 33, 60, 11, 90 };
	}
}
