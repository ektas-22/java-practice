package com.practice.interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
interface Square {
	int calculate(int x);
}

public class FunctionalInterfaceExample {
	public static void main(String[] args) {

		new Thread(() -> System.out.println("New thread created")).start();

		Square s = (int x) -> x * x;
		int ans = s.calculate(5);
		System.out.println(ans);

		// java functional interface before Java 8
		// create anonymous inner class object
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("New Thread started");
			}
		}).start();

		// Types of functional interfaces in Java - Uses stream api, collection and
		// lambda expression
		// Consumer - takes one argument, used for printing and logging
		Consumer<Integer> consumer = (value) -> System.out.println(value);

		// Predicate - boolean valued function of one argument, used for filtering in stream
		//public interface Predicate<T> {
		 //   boolean test(T t);
		//}
		Predicate<Integer> predicate = (value) -> value != null;
		
		//Function - takes one argument and return result, used for transforming data
		Function<Integer, Integer> function = (value) -> value * value;
		
		//Supplier - does not take any input or argument return a single output 
		Supplier<String> supplier = () -> "Hellow , World! ";
		
		List<String> ls = Arrays.asList("Geeks","Geek Quiz","G1","Global","Garage","QA","Dev");
		Predicate<String> p = (su) -> su.startsWith("G");
		for(String st: ls) {
			if(p.test(st)) {
				System.out.println(st);
			}
		}
		
	}

}
