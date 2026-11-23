package com.operators;

public class TestLogicalOp {
//logical operators 
	public static void main(String[] args) {
		System.out.println("main method started");
		int x = 10;
		int y = 20;
		int z = 30;
		System.out.println("Logical AND");
		System.out.println(true && true);// true
		System.out.println(true && false);// false
		System.out.println(false && true);// false -->Dead code
		System.out.println(false && false);// false

		System.out.println(++x <= 10 && ++x >= 10);
		System.out.println("X:" + x);

		System.out.println(x > y && x > z);// false
		System.out.println(x < y && x < z);// true
		System.out.println(x < z && y > z);// false
		System.out.println(x > z && x < z);// false

		System.out.println("Logical OR");

	}

}
