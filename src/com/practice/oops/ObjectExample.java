package com.practice.oops;

class Test {
	public Test() {}
}

class Demo implements Cloneable {
	String name = "Hello World!";

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class ObjectExample {
	public static void main(String[] args) {

		// Ways to create object in java
		// 1. Using new keyword
		Test t = new Test();

		// 2. Using Reflection
		try {
			Class<?> c = Class.forName("Test");
			Test t1 = (Test) c.getDeclaredConstructor().newInstance();
			System.out.println(t1);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 3. Using clone() method
		try {
			Demo d1 = new Demo();
			Demo d2 = (Demo) d1.clone();
			System.out.println(d2.name);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 4. Using Deserialization
	}
}
