package com.accessmodifiers01;

public class TestAccessModifier {

	public static void main(String[] args) {
		System.out.println("main method started ");
		/// We can create one class object into another class If the class constructor
		/// is private ,we cannot create objects outside of classes private constructors
		/// can help to singleton design pattern
		/// 
		TestAccessModifier1 t1 = new TestAccessModifier1();
		TestAccessModifier2 t2 = new TestAccessModifier2();
		TestAccessModifier3 t3 = new TestAccessModifier3();
		TestAccessModifier4 t4 = new TestAccessModifier4();

		/// private data members; we cannot access objects outside of the class
//		System.out.println(t1.id1);
//		System.out.println(t1.name1);
//		t1.method1();

		/// Default data members ,we can access outside of the class
		System.out.println(t2.id2);
		System.out.println(t2.name2);
		t2.method2();
		
		///protected data members;we can access outside of the class
		System.out.println(t4.id4);
		System.out.println(t4.name4);

		t4.method4();

		/// public data members;we can access outside of the class
		System.out.println(t3.id3);
		System.out.println(t3.name3);
		t3.method3();

		System.out.println("main method ended");
	}

}
