package com.practice.string;

public class StringBufferExample {
	public static void main(String[] args) {

		StringBuffer s = new StringBuffer();
		s.append("Hello");
		s.append(" ");
		s.append("World");

		String str = s.toString();
		System.out.println(str);
	}

}
