package com.azamda.solid_principle;
//Problem statement without LSP
class Vehicle {
	int noOfWheels() {
		return 2;
	}

	String hasEngine() {
		return "standard";
	}
}
//Car can be substitute of Vehicle
class Car extends Vehicle {
	int noOfWheels() {
		return 4;
	}
	String hasEngine() {
		return "turbo";
	}
}
//Bike can be substitute of Vehicle
class Bike extends Vehicle {
	String hasEngine() {
		return "basic";
	}
}

//but Bicycle can't be substitute of Vehicle, because it doesn't have engine
class Bicycle extends Vehicle {
	String hasEngine() {
		return null;
	}
}

public class WithoutLSP {
	public static void main(String[] args) {
		Vehicle v = new Car();
        System.out.println("Car has "+v.noOfWheels()+" wheels");
        System.out.println("Car has "+v.hasEngine().concat(" engine"));
        v = new Bike();
        System.out.println("Bike has "+v.noOfWheels()+" wheels");
        System.out.println("Bike has "+v.hasEngine().concat(" engine"));
        v = new Bicycle();
        System.out.println("Bicycle has "+v.noOfWheels()+" wheels");
        System.out.println("Bicycle has "+v.hasEngine().concat(" engine"));
        //NullPointerException Bicycle can't be substitute of Vehicle
	}
}
