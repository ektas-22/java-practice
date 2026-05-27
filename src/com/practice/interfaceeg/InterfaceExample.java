package com.practice.interfaceeg;

interface TestInterface{
	final int a = 10;
	void display();
}
class TestClass implements TestInterface{

	@Override
	public void display() {
		System.out.println("Geeks");
		
	}
	
}
public class InterfaceExample {
	public static void main(String[] args) {
		TestClass t = new TestClass();
		t.display();
		System.out.println(TestInterface.a);
	}
}
