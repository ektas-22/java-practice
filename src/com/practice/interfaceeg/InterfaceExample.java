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
	void changeGear(int a);

	void speedUp(int a);

	void applyBrakes(int a);
}

class Bicycle implements Vehicle {

	int speed;
	int gear;

	@Override
	public void changeGear(int newGear) {
		gear = newGear;

	}

	@Override
	public void speedUp(int increment) {
		speed = speed + increment;

	}

	@Override
	public void applyBrakes(int decrement) {
		speed = speed - decrement;
	}

	public void printStates() {
		System.out.println("Speed: " + speed + " Gear: " + gear);
	}

}

class Bike implements Vehicle {

	int speed;
	int gear;

	@Override
	public void changeGear(int newGear) {
		gear = newGear;

	}

	@Override
	public void speedUp(int increment) {
		speed = speed + increment;

	}

	@Override
	public void applyBrakes(int decrement) {
		speed = speed - decrement;
	}

	public void printStates() {
		System.out.println("Speed: " + speed + " Gear: " + gear);
	}

}

interface Add {
	int add(int a, int b);
}

interface Subtract {
	int sub(int a, int b);
}

class Calc implements Add, Subtract {

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int sub(int a, int b) {
		return a - b;
	}

}

interface DefaultInterface{
	final int a = 10;
	//default method
	default void display() {
		System.out.println("Default Hello");
	}
	
	//static method
	static void displayS() {
		System.out.println("Static hello");
	}
}

interface Vehicle1{
	private void startEngine() {
		System.out.println("Engine started");
	}
	default void drive() {
		startEngine();
		System.out.println("Vehicle is now driving");
	}
}
class Car1 implements Vehicle1{
	
}
interface A{
	void method1();
	void method2();
}
interface B extends A{
	void method3();
}
class ExtendedInterfaceEx implements B{

	@Override
	public void method1() {
		System.out.println("Method 1");
	}

	@Override
	public void method2() {
		System.out.println("Method 2");
	}

	@Override
	public void method3() {
		System.out.println("Method 3");
	}
}
public class InterfaceExample implements DefaultInterface{
	public static void main(String[] args) {

		TestClass t = new TestClass();
		t.display();
		System.out.println(TestInterface.a);

		// Inheritance implementation
		Bicycle b1 = new Bicycle();
		b1.changeGear(2);
		b1.speedUp(3);
		b1.applyBrakes(1);

		System.out.println("Bicycle present state");
		b1.printStates();

		Bike b2 = new Bike();
		b2.changeGear(1);
		b2.speedUp(4);
		b2.applyBrakes(3);

		System.out.println("Bike present state");
		b2.printStates();

		// Multiple inheritance
		Calc c = new Calc();
		System.out.println("Addition: " + c.add(2, 3));
		System.out.println("Subtraction: " + c.sub(8, 2));
		
		//Java 8+ 
		//default method in interface
		InterfaceExample di = new InterfaceExample();
		di.display();
		
		//static method
		DefaultInterface.displayS();
		
		//Java 9
		//private method
		Car1 c1 = new Car1();
		c1.drive();
		
		//extending interface
		ExtendedInterfaceEx ei = new ExtendedInterfaceEx();
		ei.method1();
		ei.method2();
		ei.method3();
	}
}
