package com.practice.string;

public class StringBufferExample {
	public static void main(String[] args) {

		// StringBuffer to concatenate strings.
		StringBuffer s = new StringBuffer();
		s.append("Hello");
		s.append(" ");
		s.append("World");

		String str = s.toString();
		System.out.println(str);

		// Constructors of StringBuffer Class
		StringBuffer sb = new StringBuffer();
		sb.append("Hello");
		System.out.println("Default constructor: " + sb);

		StringBuffer sb1 = new StringBuffer(50);
		sb1.append("Java Programming");
		System.out.println("int size consttructor: " + sb1);

		StringBuffer sb2 = new StringBuffer("Welcome");
		sb2.append(" to Java.");
		System.out.println("String Constructor: " + sb2);
		
		//insert() method
		
		//replace() method
		
		//delete() Method
		
		//reverse() Method
		
		//capacity() Method
		
		

	}

}
