package com.practice.oops;

public class DogClass {
	String name;
	String breed;
	int age;
	String color;

	public DogClass(String name, String breed, int age, String color) {
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public String getBreed() {
		return breed;
	}

	public int getAge() {
		return age;
	}

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "Name is: " + name + "\n breed, age and color are: " + breed + " " + age + " " + color;
	}

	public static void main(String[] args) {
		DogClass tuffy = new DogClass("Tuffy", "Papillon", 5, "White");
		System.out.println(tuffy.toString());
	}

}
