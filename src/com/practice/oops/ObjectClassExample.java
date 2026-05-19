package com.practice.oops;

import java.io.Serializable;

class First {
	int age = 30;
	String name = "Lisa";

	@Override
	public String toString() {
		return "Student name: " + name + " age: " + age;
	}
}

class Second {
	int id = 101;

	@Override
	public int hashCode() {
		return id * 31;
	}
}

class Third {
	String title;

	Third(String title) {
		this.title = title;
	}

	@Override
	public boolean equals(Object obj) {
		Third t = (Third) obj;
		return this.title.equals(t.title);
	}
}

class Sixth implements Cloneable {

	int id = 1;
	String name = "Hello";

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

public class ObjectClassExample {
	public static void main(String[] args) throws Exception {
		// Object Class Method
		// 1. toString() Method
		First f = new First();
		System.out.println(f.toString());

		// 2. hashCode() Method
		Second s = new Second();
		System.out.println(s.hashCode());

		// 3. equals(Object obj) Method
		Third t1 = new Third("Java");
		Third t2 = new Third("Java");
		System.out.println(t1.equals(t2));

		// 4. getClass() method
		Object o = new String("GeeksforGeeks");
		Class<?> c = o.getClass();
		System.out.println(c.getName());

		// 5. finalize() method
		ObjectClassExample oc = new ObjectClassExample();
		System.out.println(oc.hashCode());
		oc = null;

		System.gc();
		System.out.println("end");

		// 6. clone() method
		Sixth s1 = new Sixth();
		Sixth s2 = (Sixth) s1.clone();
		System.out.println(s1.name);
		System.out.println(s2.name);

		// 7. Concurrency Methods: wait(), notify() and notifyAll()
	}

	@Override
	protected void finalize() {
		System.out.println("Finalize method called");
	}
}
