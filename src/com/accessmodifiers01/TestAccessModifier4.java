package com.accessmodifiers01;

public class TestAccessModifier4 {

	protected void method4() {
		System.out.println("Method4 called!! ");
	}

	// protected data members
	protected int id4 = 9;
	protected String name4 = "Srikanth";

	public static void main(String[] args) {
		System.out.println("main method started from TestAccessModifier4");
		TestAccessModifier4 t4 = new TestAccessModifier4();

		// Accessing protected members within the class
		//we can access protected data members within the class
		System.out.println(t4.id4);
		System.out.println(t4.name4);

		t4.method4();

		System.out.println("main method ended from TestAccessModifier4");

	}

}
