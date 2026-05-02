package com.practice.string;

import java.util.StringTokenizer;

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

		// CharSequence Interface
		// Classes that implement charSequence include
		// 1. String
		String str2 = "Hello World!";
		String str3 = new String("John");
		System.out.println(str2 + " " + str3);

		// 2. StringBuffer
		StringBuffer stb = new StringBuffer("Hello String Buffer");
		System.out.println(stb);

		// 3. StringBuilder
		StringBuilder stb2 = new StringBuilder();
		stb2.append("Hello");
		System.out.println(stb2);

		// 4. StringTokenizer
		StringTokenizer strz = new StringTokenizer("Hello World Example");
		System.out.println(strz);

		// Immutable String in Java
		String str4 = "Sachin";
		str4.concat("Tendulkar");
		System.out.println(str4);

	}
}
