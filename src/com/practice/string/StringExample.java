package com.practice.string;

public class StringExample {
	public static void main(String[] args) {

		// Example 1 - creating java string using new keyword
		String str1 = new String("Hello");
		System.out.println(str1);

		// Ways of Creating a Java String
		// 1. String literal (Static Memory)
		String str = "Hello World";
		System.out.println(str);
		// 2. Using new keyword (Heap Memory)
		String stra = new String("Hello");
		System.out.println(stra);
		
	}
}
