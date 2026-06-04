package com.practice.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionInterfaceExample {
	public static void main(String[] args) {
		
		//Declaration
		//public interface Collection<E> extends Iterable<E>
		
		Collection<String> fruits = new ArrayList<>();
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Apple");
		
		fruits.remove("Banana");
		System.out.println(fruits);
	}
}
