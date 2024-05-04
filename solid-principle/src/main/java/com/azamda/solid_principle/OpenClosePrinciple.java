package com.azamda.solid_principle;

//Perform addition and subtraction 
class Calculator {
	public double add(double a, double b) {
		return a + b;
	}

	public double subtract(double a, double b) {
		return a - b;
	}
//in future if we want to perform multiplication or division we need to modify the class
//which will violate the OCP
}

//to avoid this lets make individual implementation class by following interface & general method
interface CalculatorInterface {
	public double calculate(double a, double b);
}

class Addition implements CalculatorInterface {
	@Override
	public double calculate(double a, double b) {
		return a + b;
	}
}

class Subtraction implements CalculatorInterface {
	@Override
	public double calculate(double a, double b) {
		return a - b;
	}
}

class Multiplication implements CalculatorInterface {
	@Override
	public double calculate(double a, double b) {
		return a * b;
	}
}

class Division implements CalculatorInterface {
	@Override
	public double calculate(double a, double b) {
		return a / b;
	}
}

public class OpenClosePrinciple {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		System.out.println(calculator.add(10, 20));
		System.out.println(calculator.subtract(10, 20));

		CalculatorInterface calc = new Addition();
		// new Subtraction();
		// new Multiplication();
		// new Division();
		System.out.println(calc.calculate(10, 5));
		;
	}
}
