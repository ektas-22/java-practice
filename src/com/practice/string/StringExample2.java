package com.practice.string;

public class StringExample2 {
	public static void main(String[] args) {

		// Example Demonstrating Immutability
		String str1 = "Hello";
		String str2 = "Hello";
		System.out.println("str1=str2 - " + (str1 == str2));
		str1 = str1.concat(" World");
		System.out.println("String 1 - " + str1);
		System.out.println("String 2 - " + str2);
		System.out.println("str1=str2 - " + (str1 == str2));

		String str3 = new String("Hello");
		System.out.println("str2==str3 - " + (str2 == str3));
		System.out.println("str2.equals(s3) - " + str2.equals(str3));

	}

}
