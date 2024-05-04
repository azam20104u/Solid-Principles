package com.azamda.solid_principle;

interface A {
	void m1();

	void m2();
}

class B implements A {
	@Override
	public void m1() {
		System.out.println("m1() implemented by B");
	}

	@Override
	public void m2() {
		System.out.println("m2() implemented by B");
	}
}

class C implements A {
	@Override
	public void m1() {
		System.out.println("m1() implemented by C");
	}

	@Override
	public void m2() {
		//C doesn't want to implement, but no choice to avoid compilation error.
	}
	
}

public class WithoutISP {

}
