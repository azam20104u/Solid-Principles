package com.azamda.solid_principle;

interface A1 {
	void m1();
}

interface A2 extends A1 {
	void m2();
}

class B1 implements A2 {
	@Override
	public void m1() {
		System.out.println("m1() implemented by B");
	}

	@Override
	public void m2() {
		System.out.println("m2() implemented by B");
	}
}

class C1 implements A1 {
	@Override
	public void m1() {
		System.out.println("m1() implemented by C");
	}
}

public class InterfaceSegregationPrinciple {

}
