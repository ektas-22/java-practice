package com.practice.interfaceeg;

interface Serializable{
	
}
class Person implements Serializable{
	public Person() {
		System.out.println("Person object created");
	}
}
class Animal{
	public Animal() {
		System.out.println("Animal object created");
	}
}
public class MarkerInterfaceExample {
	public static void main(String[] args) {
		
		Person p = new Person();
		Animal a = new Animal();
		if(p instanceof Serializable) {
			System.out.println();
		}else {
			System.out.println();
		}
		if(a instanceof Serializable) {
			System.out.println();
		}
	}
}
