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

		// insert() method
		StringBuffer sb3 = new StringBuffer("Hello");
		sb3.insert(2, "Java");
		System.out.println(sb3);

		// replace() method
		StringBuffer sb4 = new StringBuffer("Hello World !");
		sb4.replace(1, 4, "olaa");
		System.out.println(sb4);

		// delete() Method
		StringBuffer sb5 = new StringBuffer("Hello World!");
		sb5.delete(1, 3);
		System.out.println(sb5);

		// reverse() Method
		StringBuffer sb6 = new StringBuffer("Hello");
		sb6.reverse();
		System.out.println(sb6);

		// capacity() Method
		StringBuffer sb7 = new StringBuffer();
		sb7.capacity();
		System.out.println(sb7);
		sb7.append("Hello");
		System.out.println(sb7.capacity());
		sb7.append("Java is a programming language");
		System.out.println(sb7.capacity());

		// length()
		StringBuffer sb8 = new StringBuffer("Hello Java");
		int p = sb8.length();
		System.out.println("Length of string: " + p);

		
	}

}
