package com.accessmodifier02;

import com.accessmodifiers01.TestAccessModifier1;
import com.accessmodifiers01.TestAccessModifier2;
import com.accessmodifiers01.TestAccessModifier3;
import com.accessmodifiers01.TestAccessModifier4;

public class TestAccessModifier5 extends TestAccessModifier4 {

	public static void main(String[] args) {
		System.out.println("main method started from TestAccessModifier5");

		TestAccessModifier1 t1 = new TestAccessModifier1();

		TestAccessModifier2 t2 = new TestAccessModifier2();
		TestAccessModifier3 t3 = new TestAccessModifier3();
		TestAccessModifier4 t4 = new TestAccessModifier4();
		TestAccessModifier5 t5 = new TestAccessModifier5();
		/// we cannot access private data members outside of package
//		System.out.println(t1.id1);
//		System.out.println(t1.name1);
//
//		t1.method1();

		/// we cannot access default class members outside of package
//		System.out.println(t2.id2);
//		System.out.println(t2.name2);
//
//		t2.method2();
		/// we cannot access protected class members outside of packages directly The
		/// field TestAccessModifier4.id4 is not visible
//		System.out.println(t4.id4);
//		System.out.println(t4.name4);
//		t4.method4();
		//// we can access protected data members using subclass object  reference only
		System.out.println(t5.id4);
		System.out.println(t5.name4);
		t5.method4();

		/// public data members ,we can access outside of package
		System.out.println(t3.id3);
		System.out.println(t3.name3);
		t3.method3();

		System.out.println("main method ended from TestAccessModifier5");

	}

}
