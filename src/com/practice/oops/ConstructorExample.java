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

class Geeks {
	Geeks() {
		System.out.println("Default Constructor");
	}
}

class Geekss {
	int id;
	String name;

	Geekss(int id, String name) {
		this.id = id;
		this.name = name;
	}

	void display() {
		System.out.println("Parameterized constructor example: Id- " + id + ", Name- " + name);
	}
}

class Geeksss {
	int id;
	String name;

	Geeksss(int id, String name) {
		this.id = id;
		this.name = name;
	}

	Geeksss(Geeksss g) {
		this.id = g.id;
		this.name = g.name;
	}
}

class GFG {
	private GFG() {
		System.out.println("Private constructor called");
	}

	public static void displayMessage() {
		System.out.println("Hello from GFG class");
	}
}

class GeekOverLoad {
	GeekOverLoad(String name) {
		System.out.println("Constructor with one argument- " + name);
	}

	GeekOverLoad(String name, int age) {
		System.out.println("Constructor with two argument- " + name + age);
	}

	GeekOverLoad(long id) {
		System.out.println("Constructor with one argumentbut different type - " + id);
	}
}

public class ConstructorExample {
	public static void main(String[] args) {
		Student2 s1 = new Student2("Peter");
		s1.display();

		// Default Constructor
		@SuppressWarnings("unused")
		Geeks g1 = new Geeks();

		// Parameterized Constructor
		Geekss g2 = new Geekss(1, "Lisa");
		g2.display();

		// Copy Constructor
		Geeksss g3 = new Geeksss(2, "Roma");
		System.out.println("First constructor to be copied with id and name: " + g3.id + " " + g3.name);
		Geeksss g4 = new Geeksss(g3);
		System.out.println("Copy constructor: id- " + g4.id + " name-" + g4.name);

		// Private Constructor
		// GFG g5 = new GFG(); //Error: constructor is private
		GFG.displayMessage();

		// Constructor Overloading
		GeekOverLoad g6 = new GeekOverLoad("John");
		GeekOverLoad g7 = new GeekOverLoad("Laura", 30);
		GeekOverLoad g8 = new GeekOverLoad(893486347);
	}
}
