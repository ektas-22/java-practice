package com.practice.oops;

class Person {
	void role() {
		System.out.println("I am a person");
	}
}

class Father extends Person {
	@Override
	void role() {
		System.out.println("I am a father");
	}
}

//Method Overloading
class Helper {
	static int multiply(int x, int y) {
		return x * y;
	}

	static double multiply(double x, double y) {
		return x * y;
	}
}

class Parent {
	void print() {
		System.out.println("Parent class");
	}
}

class SubClass1 extends Parent {
	void print() {
		System.out.println("Sub class 1");
	}
}

class SubClass2 extends Parent {
	void print() {
		System.out.println("Sub class 2");
	}
}

public class PolymorphismExample {
	public static void main(String[] args) {
		Person p = new Father();
		p.role();

		// Method Overloading - compile time
		System.out.println(Helper.multiply(4, 5));
		System.out.println(Helper.multiply(4.5, 2.5));

		// Method Overriding - run time
		Parent p1;
		p1 = new SubClass1();
		p1.print();
		p1 = new SubClass2();
		p1.print();
	}
}
