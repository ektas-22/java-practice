package com.practice.collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionExample {
	public static void main(String[] args) {

		// Dynamic array in the collection framework
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Banana");
		fruits.add("Qiwi");
		fruits.add("Apple");
		fruits.add("Mango");

		Collections.sort(fruits);
		System.out.println(fruits);

		ArrayList<String> list = new ArrayList<>();
		list.add("Python");
		list.add("Java");
		list.add("Sql");
		list.add("HTML");
		
		for(String lang : list) {
			System.out.println(lang);
		}
	}
}
