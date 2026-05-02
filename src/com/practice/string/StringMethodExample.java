package com.practice.string;

public class StringMethodExample {
	public static void main(String[] args) {

		// concatenation method
		String str = "Hello";
		str = str.concat(" World");
		System.out.println(str);

		// Combining two string with concatenation
		String str1 = "Hello";
		String str2 = " World";
		str1 = str.concat(str2);
		System.out.println(str1);

		// sequential concatenation of multiple strings
		String str3 = "Welcome";
		String str4 = " to";
		String str5 = str3.concat(str4);
		System.out.println(str5);
		String str6 = " Programming";
		String str7 = str5.concat(str6);
		System.out.println(str7);

		// Example: Handling NullPointerException in String concat()
		String str8 = "Hello";
		String str9 = null;
//		String str10 = str8.concat(str9);
//		System.out.println(str10);

		// Reversing a String Using concat() Method
		String str11 = "Hello";
		String rstr = "";
		for (int i = str11.length() - 1; i >= 0; i--) {
			char ch = str11.charAt(i);
			String newChar = Character.toString(ch);
			rstr = rstr.concat(newChar);
		}
		System.out.println(str11);
		System.out.println(rstr);
	}
}
