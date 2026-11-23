package com.operators;

public class TestShiftOperator {

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("Left Shift Operator");
		int x = 79;
		int y = 2;
		System.out.println(x << y);
		System.out.println("Right Shift Operator");
		int a = 83;
		int b = 2;
		System.out.println(a >> b);
		System.out.println("Right unsigned");
		System.out.println(-8 >>> 1);
		System.out.println(-8 >> 1);// -8
		System.out.println("main method ended");

	}

}
