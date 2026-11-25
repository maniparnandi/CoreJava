package com.accessmodifiers01;

public class TestAccessModifier2 {

	/// Blocks scope is class scope
	{
		System.out.println("Instance block called");
	}

	static {
		System.out.println("static block called");
	}
	//default data members
	int id2 = 18;
	String name2 = "Virat";

	void method2() {
		System.out.println("Method 2 called!!");
	}

	public static void main(String[] args) {
		System.out.println("main method started from TestAccessModifier2");
		TestAccessModifier2 t2 = new TestAccessModifier2();
		System.out.println(t2.id2);
		System.out.println(t2.name2);

		t2.method2();

		System.out.println("main method ended from TestAccessModifier2");

	}

	/// inner classes and interfaces
	class TestA {

	}

	interface In1 {

	}
}
