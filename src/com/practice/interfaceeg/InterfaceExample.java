package com.practice.interfaceeg;

interface TestInterface {
	final int a = 10;

	void display();
}

class TestClass implements TestInterface {

	@Override
	public void display() {
		System.out.println("Geeks");

	}

}

interface Vehicle {
	void gearUp();

	void increaseSpeed();
}

class Bicycle implements Vehicle {

	@Override
	public void gearUp() {
		// TODO Auto-generated method stub

	}

	@Override
	public void increaseSpeed() {
		// TODO Auto-generated method stub

	}

}

class Bike implements Vehicle {

	@Override
	public void gearUp() {
		// TODO Auto-generated method stub

	}

	@Override
	public void increaseSpeed() {
		// TODO Auto-generated method stub

	}

}

interface Add {

}

interface Subtract {

}

class Calc implements Add, Subtract {

}

public class InterfaceExample {
	public static void main(String[] args) {
		TestClass t = new TestClass();
		t.display();
		System.out.println(TestInterface.a);
	}
}
