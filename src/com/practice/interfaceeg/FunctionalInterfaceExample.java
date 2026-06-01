package com.practice.interfaceeg;


@FunctionalInterface
interface Square{
	int calculate(int x);
}
public class FunctionalInterfaceExample {
	public static void main(String[] args) {
		
		new Thread(() -> System.out.println("New thread created")).start();
		
		Square s = (int x) -> x * x;
		int ans = s.calculate(5);
		System.out.println(ans);
	}

}
