package com.practice.oops;

class Animal {
	void sound() {
		System.out.println("Animal makes a sound");
	}
}

class Cat extends Animal {
	void sound() {
		System.out.println("Cat Meow");
	}
}

class Dog extends Animal {
	void sound() {
		System.out.println("Dog barks");
	}
}

class Cow extends Animal {
	void sound() {
		System.out.println("Cow moos");
	}
}

//Single Inheritance
class SingleInheritance {
	SingleInheritance() {
		System.out.println("This is single inheritance parent class constructor");
	}
}

class SingleInheritanceSub extends SingleInheritance {
	SingleInheritanceSub() {
		System.out.println("This is single inheritance sub class constructor");
	}
}

//multilevel inheritance
class Vehicle {
	Vehicle() {
		System.out.println("This is a Vehicle");
	}
}

class FourWheeler extends Vehicle {
	public FourWheeler() {
		System.out.println("This is a fourwheeler");
	}
}

class Car extends FourWheeler {
	Car() {
		System.out.println("This four wheeler vehicle is a car");
	}
}

//hierarchical inheritance
class Vehicle1 {
	Vehicle1() {
		System.out.println("This is a vehicle1");
	}
}

class Car1 extends Vehicle1 {
	Car1() {
		System.out.println("This vehicle1 is a car1");
	}
}

class Bus extends Vehicle1 {
	Bus() {
		System.out.println("This vehicle is a bus");
	}
}

//Multiple Inheritance
interface WaterVehicle {
	default void waterinfo() {
		System.out.println("This is a water vehicle");
	}
}

interface LandVehicle {
	default void landinfo() {
		System.out.println("This is a land vehicle");
	}
}

class AmphibiousVehicle implements WaterVehicle, LandVehicle {
	public AmphibiousVehicle() {
		System.out.println("This is a amphibious vehicle");
	}
}

//Hybrid inheritance

class Vehicle2 {
	void vehicleType() {
		System.out.println("This is a vehicle");
	}
}

interface Fair {
	default void fareInfo() {
		System.out.println("Fare information");
	}
}

class Car2 extends Vehicle2 {
	void carType() {
		System.out.println("This is a car");
	}
}

class Bus1 extends Vehicle2 implements Fair {
	void busType() {
		System.out.println("This is a bus");
	}
}

public class InterfaceExample {
	public static void main(String[] args) {
		Animal a;
		a = new Cat();
		a.sound();
		a = new Dog();
		a.sound();
		a = new Cow();
		a.sound();

		// single inheritance
		SingleInheritanceSub si = new SingleInheritanceSub();

		// multilevel inheritance
		Car cm = new Car();

		// hierarchical inheritance
		Car1 chi1 = new Car1();
		Bus bhi = new Bus();

		// multiple inheritance
		AmphibiousVehicle ami = new AmphibiousVehicle();
		ami.waterinfo();
		ami.landinfo();

		// hybrid inheritance
		Car2 chi = new Car2();
		chi.vehicleType();
		chi.carType();

		Bus1 bhi2 = new Bus1();
		bhi2.vehicleType();
		bhi2.fareInfo();
		bhi2.busType();

	}
}
