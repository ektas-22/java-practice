package com.practice.oops;

class StudentExample {
	int id;
	String n;

	public StudentExample(int id, String n) {
		this.id = id;
		this.n = n;
	}
}

public class OopsExample {

	public static void main(String[] args) {
		StudentExample s1 = new StudentExample(1, "John");
		System.out.println(s1.id);
		System.out.println(s1.n);
		
		//OBJECT
		//Declaration
		//Dog tuffy;
		
		//Initialization
		//tuffy = new Dog(Tuffy", "Papillon", 5, "White");
	}
}
