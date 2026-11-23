package com.operators;

import java.util.Scanner;

public class TestArithmeticOperators {
	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		System.out.println("enter b number");
		int b = sc.nextInt();
		// follows BODMAS
		// addition
		System.out.println("sum of two numbers:" + (a + b));
		// difference
		System.out.println("difference:" + (a - b));
		// product
		System.out.println("product" + a * b);
		// quotient
		System.out.println("quotient" + a / b);
		// remainder
		System.out.println("remainder" + a % b);
		System.out.println("main method ended");
	}

}
