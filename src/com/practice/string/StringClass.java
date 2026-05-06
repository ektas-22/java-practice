package com.practice.string;

public class StringClass {
	public static void main(String[] args) {

		// Immutable
		String str = "Hello";
//		str.charAt(0) = 'l';	//Compile time error 

		// supports various utility methods
		String str1 = "Hello World";
		System.out.println("length method - " + str1.length());
		System.out.println("Upper Case method - " + str1.toUpperCase());

		// String Constructors in Java
		String str2 = new String("Hello Java");
		System.out.println("String using enw keyword " + str2);
		char[] charArray = { 'j', 'a', 'v', 'a' };
		String str3 = new String(charArray);
		System.out.println("String from char array " + str3);
		byte[] byteArray = { 72, 101, 108, 108, 111 };
		String str4 = new String(byteArray);
		System.out.println("String  using byte array " + str4);

	}

}
