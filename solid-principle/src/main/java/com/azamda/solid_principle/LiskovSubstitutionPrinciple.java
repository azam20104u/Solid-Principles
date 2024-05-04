package com.azamda.solid_principle;
//Solution by LSP
class Vehicle1 {
	int noOfWheels() {
		return 2;
	}
}
class EngineVehicle extends Vehicle1{
	String hasEngine() {
		return "standard";
	}
}
//Car can be substitute of Vehicle and EngineVehicle super class
class Car1 extends EngineVehicle {
	int noOfWheels() {
		return 4;
	}
	String hasEngine() {
		return "turbo";
	}
}
//Bike can be substitute of Vehicle and EngineVehicle super class
class Bike1 extends EngineVehicle {
	String hasEngine() {
		return "basic";
	}
}

//now Bicycle can be substitute of Vehicle super class
class Bicycle1 extends Vehicle1 {
}

public class LiskovSubstitutionPrinciple {
	public static void main(String[] args) {
		EngineVehicle v = new Car1();
        System.out.println("Car has "+v.noOfWheels()+" wheels");
        System.out.println("Car has "+v.hasEngine().concat(" engine"));
        v = new Bike1();
        System.out.println("Bike has "+v.noOfWheels()+" wheels");
        System.out.println("Bike has "+v.hasEngine().concat(" engine"));
        Vehicle1 v1 = new Bicycle1();
        System.out.println("Bicycle has "+v1.noOfWheels()+" wheels");
	}
}
