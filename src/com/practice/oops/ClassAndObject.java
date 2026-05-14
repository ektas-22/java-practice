package com.practice.oops;

class Product {
	String name;
	float price;

	public Product(String name, float price) {
		this.name = name;
		this.price = price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public float getPrice() {
		return price;
	}

}

public class ClassAndObject {

	public static void main(String[] args) {
		Product p1 = new Product("VS Code", 0.0f);
		Product p2 = new Product("IntelliJ", 4999.0f);
		System.out.println(p1.getName() + " " + p1.getPrice());
		System.out.println(p2.getName() + " " + p2.getPrice());
	}

}
