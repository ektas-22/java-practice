package com.practice.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionInterfaceExample {
	public static void main(String[] args) {

		//==========COLLECTION INTERFACE==========================
		// Declaration
		// public interface Collection<E> extends Iterable<E>

		Collection<String> fruits = new ArrayList<>();
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Apple");

		fruits.remove("Banana");
		System.out.println(fruits);

		// Adding elements
		Collection<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);

		Collection<Integer> moreNumber = new ArrayList<>();
		moreNumber.add(40);
		moreNumber.add(50);

		numbers.addAll(moreNumber);
		System.out.println(numbers);

		// Removing elements
		Collection<String> fruits2 = new ArrayList<>();
		fruits2.add("Apple");
		fruits2.add("Banana");
		fruits2.add("Qiwi");
		fruits2.add("Mango");
		fruits2.add("Strawaberry");

		fruits2.remove("Qiwi");
		System.out.println(fruits2);

		Collection<String> toRemove = new ArrayList<>();
		toRemove.add("Banana");
		toRemove.add("Apple");

		fruits2.removeAll(toRemove);
		System.out.println(fruits2);

		// Accessing elements
		List<String> colors = new ArrayList<>();
		colors.add("purple");
		colors.add("black");
		colors.add("pink");
		System.out.println(colors);

		String firstColor = colors.get(0);
		String lastColor = colors.get(colors.size() - 1);
		System.out.println(firstColor);
		System.out.println(lastColor);

		// Iterating elements
		// Iterator
		Collection<String> fruits3 = new ArrayList<>(Arrays.asList("Apple", "Banana", "Mango"));

		Iterator<String> it = fruits3.iterator();
		while (it.hasNext()) {
			String fruit = it.next();
			if (fruit.equals("Banana")) {
				fruits3.remove(fruit);
			}
		}
		System.out.println(fruits3);

		// ListIterator
		List<String> colors2 = new ArrayList<>(Arrays.asList("purple", "black", "pink"));

		ListIterator<String> it2 = colors2.listIterator();
		System.out.println("Forward");
		while (it2.hasNext()) {
			System.out.print(it2.next() + " ");
		}

		System.out.println("\n Backward");
		while (it2.hasPrevious()) {
			System.out.print(it2.previous() + " ");
		}
		
		
		//=================LIST INTERFACE=================================
		
		
	}
}
