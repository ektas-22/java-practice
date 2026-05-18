package com.practice.oops;

class Student2 {
	String name;

	Student2(String name) {
		this.name = name;
	}

	void display() {
		System.out.println("Name: " + name);
		;
	}
}

public class ConstructorExample {
	public static void main(String[] args) {
		Student2 s1 = new Student2("Peter");
		s1.display();

	}
}
