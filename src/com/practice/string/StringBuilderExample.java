package com.practice.string;

public class StringBuilderExample {
	public static void main(String[] args) {

		// basic
		StringBuilder s = new StringBuilder("Java");
		System.out.println("Initial StringBuilder: " + s);
		s.append(" is a programming language");
		System.out.println("After append: " + s);

		// StringBuilder Constructors
		StringBuilder sb1 = new StringBuilder();
		sb1.append("Hello");
		System.out.println("Empty Constructor: " + sb1);
		StringBuilder sb2 = new StringBuilder(50);
		sb2.append("This has initial capacity 50");
		System.out.println("Capacity: " + sb2);
	}

}
