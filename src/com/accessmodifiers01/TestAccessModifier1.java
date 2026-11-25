package com.accessmodifiers01;
///Illegal modifier for the interface TestIn2; 
/// only public,<default>,strictfp & abstract are permitted
//private interface TestIn2{

/// Illegal modifier for the class TestAccessModifier1; only
/// public,<default>,strictfp, abstract & final are permitted
//private class TestAccessModifier1{

public class TestAccessModifier1 {

	/// Syntax error, insert "Identifier" to complete CompactConstructorHeade We
	/// cannot write private for instance block
//	private {
//		System.out.println("Instance block called");
//	}
	/// Blocks scope is class scope
	{
		System.out.println("Instance block called");
	}

	/// we cannot write private for static block
//	private static {
//		System.out.println("static block called");
//	}
	static {
		System.out.println("static block called");
	}
	//private data members
	private int id1;
	private String name1;

	private void method1() {
		System.out.println("Method 1 called!!");
	}

	// by using private constructor
	// we can stop creation of objects outside of classes
//	private TestAccessModifier1() {
//		System.out.println("no arg constructor called");
//	}

	public static void main(String[] args) {
		System.out.println("main method started from TestAccessModifier1");
		TestAccessModifier1 t1 = new TestAccessModifier1();
		//Accessing private members within the class
		System.out.println(t1.id1);
		System.out.println(t1.name1);

		t1.method1();

		System.out.println("main method ended from TestAccessModifier1");

	}

	/// inner classes and interfaces
	private class TestA {

	}

	private interface In1 {

	}
}
