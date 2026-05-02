package com.practice.string;

import java.util.StringTokenizer;

public class StringExample {
	public static void main(String[] args) {

		// Example 1 - creating java string using new keyword
		String str1 = new String("Hello");
		System.out.println("Using new operator - " + str1);

		// Ways of Creating a Java String
		// 1. String literal (Static Memory)
		String str = "Hello World";
		System.out.println("Using string literal - " + str);
		// 2. Using new keyword (Heap Memory)
		String stra = new String("Hello");
		System.out.println("String using new keyword - " + stra);

		// CharSequence Interface
		// Classes that implement charSequence include
		// 1. String
		String str2 = "Hello World!";
		String str3 = new String("John");
		System.out.println(str2);
		System.out.println(str3);

		// 2. StringBuffer
		StringBuffer stb = new StringBuffer("Hello String Buffer");
		System.out.println("String buffer - " + stb);

		// 3. StringBuilder
		StringBuilder stb2 = new StringBuilder();
		stb2.append("Hello");
		System.out.println("String builder - " + stb2);

		// 4. StringTokenizer
		StringTokenizer strz = new StringTokenizer("Hello World Example");
		System.out.println(strz);

		// Immutable String in Java
		String str4 = "Sachin";
		str4.concat("Tendulkar");
		System.out.println(str4);

		// Reference explicitly
		String str5 = "Sachin";
		str5 = str5.concat(" Tendulkar");
		System.out.println(str5);

		// String using others
		char character[] = { 'H', 'i', 'i' };
		String str6 = new String(character);
		System.out.println("String using character - " + str6);
		String str7 = new String(str6);
		System.out.println("String using another string - " + str7);

	}
}
