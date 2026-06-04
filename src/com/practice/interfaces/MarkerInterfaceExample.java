package com.practice.interfaces;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
//import java.rmi.Remote;
//import java.rmi.RemoteException;

interface Serializable {

}

class Person implements Serializable {
	public Person() {
		System.out.println("Person object created");
	}
}

class Animal {
	public Animal() {
		System.out.println("Animal object created");
	}
}

class Ac implements Cloneable {
	int i;

	public Ac(int i) {
		this.i = i;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class As implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	int i;
	String s;

	As(int i, String s) {
		this.i = i;
		this.s = s;
	}
}

//public interface Hello extends Remote{
//	String sayHello()  throws RemoteException;
//}

public class MarkerInterfaceExample {
	public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {

		Person p = new Person();
		Animal a = new Animal();
		if (p instanceof Serializable) {
			System.out.println("Person is serializable");
		} else {
			System.out.println("Person is not serializable");
		}
		if (a instanceof Serializable) {
			System.out.println("Animal is serializable");
		} else {
			System.out.println("Animal is not serializable");
		}

		// Cloneable
		Ac a1 = new Ac(29);
		Ac b = (Ac) a1.clone();
		System.out.println(b.i);

		// Serializable
		As a2 = new As(2, "Serializable");
		FileOutputStream fs = new FileOutputStream("xyz.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fs);
		oos.writeObject(a2);

		FileInputStream fi = new FileInputStream("xyz.txt");
		ObjectInputStream ois = new ObjectInputStream(fi);
		As b2 = (As) ois.readObject();

		System.out.println(b2.i + " " + b2.s);

		oos.close();
		ois.close();
	}
}
