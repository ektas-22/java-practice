package com.practice.oops;

class Student {
	int id;
	String n;

	public Student(int id, String n) {
		this.id = id;
		this.n = n;
	}
}

public class OopsExample {

	public static void main(String[] args) {
		Student s1 = new Student(1, "John");
		System.out.println(s1.id);
		System.out.println(s1.n);
		
		//OBJECT
		//Declaration
		//Dog tuffy;
		
		//Initialization
		//tuffy = new Dog(Tuffy", "Papillon", 5, "White");
	}
}
