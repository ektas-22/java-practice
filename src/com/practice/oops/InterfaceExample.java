package com.practice.oops;

class Animal {
	void sound() {
		System.out.println("Animal makes a sound");
	}
}

class Cat extends Animal {
	void sound() {
		System.out.println("Cat Meow");
	}
}

class Dog extends Animal {
	void sound() {
		System.out.println("Dog barks");
	}
}

class Cow extends Animal {
	void sound() {
		System.out.println("Cow moos");
	}
}

public class InterfaceExample {
	public static void main(String[] args) {
		Animal a;
		a = new Cat();
		a.sound();
		a = new Dog();
		a.sound();
		a = new Cow();
		a.sound();
	}
}
