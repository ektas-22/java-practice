package com.practice.oops;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Test {
	public Test() {
	}
}

class Demo implements Cloneable {
	String name = "Hello World!";

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;

	public Student(String name) {
		this.name = name;
	}

	public String toString(String name) {
		return "Student: " + name;
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
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
			out.writeObject(new Student("Alice"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"))) {
			Student s = (Student) in.readObject();
			System.out.println(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
