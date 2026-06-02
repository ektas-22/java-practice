package com.practice.interfaceeg;

class Outer {
	interface Inner {
		public void display();
	}
}

public class NestedInterfaceExample implements Outer.Inner {
	public static void main(String[] args) {

		Outer.Inner oi = new NestedInterfaceExample();
		oi.display();
	}

	@Override
	public void display() {
		System.out.println("Hello from nested interface inside a class.");
	}
}
