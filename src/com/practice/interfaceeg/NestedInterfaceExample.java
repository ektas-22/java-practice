package com.practice.interfaceeg;

class Outer {
	interface Inner {
		public void display();
	}
}

interface OuterInterface {
	void show();

	interface InnerInterface {
		void msg();
	}
}

public class NestedInterfaceExample implements Outer.Inner, OuterInterface.InnerInterface {
	public static void main(String[] args) {

		Outer.Inner oi = new NestedInterfaceExample();
		oi.display();

		OuterInterface.InnerInterface oi2 = new NestedInterfaceExample();
		oi2.msg();
	}

	@Override
	public void display() {
		System.out.println("Hello from nested interface inside a class.");
	}

	@Override
	public void msg() {
		System.out.println("Hello from nested interface inside a interface.");
	}
}
