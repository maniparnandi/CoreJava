package com.accessmodifiers01;

public class TestAccessModifier3 {

	/// Blocks scope is class scope
	{
		System.out.println("Instance block called");
	}

	static {
		System.out.println("static block called");
	}

	// Public data members we can access within the class
	public int id3 = 7;
	public String name3 = "MSD";

	public void method3() {
		System.out.println("Method 3 called!!");
	}

	public static void main(String[] args) {
		System.out.println("main method started from TestAccessModifier3");
		TestAccessModifier3 t3 = new TestAccessModifier3();
		// public data members ,we can access within the class
		System.out.println(t3.id3);
		System.out.println(t3.name3);

		t3.method3();

		System.out.println("main method ended from TestAccessModifier3");

	}

	/// inner classes and interfaces
	public class TestA {

	}

	public interface In1 {

	}
}
