package com.practice.oops;

abstract class TV {
	abstract void turnOn();

	abstract void turnOff();
}

class TVRemote extends TV {

	@Override
	void turnOn() {
		System.out.println("Tv is turned on");
	}

	@Override
	void turnOff() {
		System.out.println("Tv is turned off");
	}

}

abstract class Shape {
	String color;

	abstract double area();

	public abstract String toString();

	public Shape(String color) {
		System.out.println("Shape costructor called");
		this.color = color;
	}

	public String getColor() {
		return color;
	}
}

class Circle extends Shape {
	double radius;

	public Circle(String color, double radius) {
		super(color);
		System.out.println("Circle constructor called");
		this.radius = radius;

	}

	@Override
	double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		return "Circle color is: " + super.getColor() + " and area is " + area();
	}

}

class Rectangle extends Shape {
	double length;
	double width;

	public Rectangle(String color, double length, double width) {
		super(color);
		System.out.println("Rectangle constructor is called");
		this.length = length;
		this.width = width;
	}

	@Override
	double area() {
		return length * width;
	}

	@Override
	public String toString() {
		return "Rectangle color is: " + super.getColor() + " and area is " + area();
	}

}

interface Shapes {
	double calculatedArea();
}

class Circles implements Shapes {

	private double r;

	public Circles(double r) {
		this.r = r;
	}

	@Override
	public double calculatedArea() {
		return Math.PI * r * r;
	}
}

class Rectangles implements Shapes {
	double l;
	double w;

	public Rectangles(double l, double w) {
		this.l = l;
		this.w = w;
	}

	@Override
	public double calculatedArea() {
		return l * w;
	}
}

public class AbstractionExample {
	public static void main(String[] args) {
		TV remote = new TVRemote();
		remote.turnOn();
		remote.turnOff();

		Shape s1 = new Circle("Red", 4);
		Shape s2 = new Rectangle("Yellow", 10, 20);

		System.out.println(s1.toString());
		System.out.println(s2.toString());

		Shapes s3 = new Circles(2.5);
		Shapes s4 = new Rectangles(10, 20);
		System.out.println("Area of circle: " + s3.calculatedArea());
		System.out.println("Area of rectangle: " + s4.calculatedArea());
	}
}
