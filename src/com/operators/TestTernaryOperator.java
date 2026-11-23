package com.operators;

//Ternary Operator
//syntax (condition)?stmt1 : stmt2
//if condition is true then stmt1 if not stmt2 
//// It works like if else stmts

public class TestTernaryOperator {

	public static void main(String[] args) {
		int x = 10;
		int y = 100;
		int max = (x > y) ? x : y;
		System.out.println("max value from two numbers:" + max);
		int age = 21;
		String isEligible = (age > 18) ? "yes" : "no";
		System.out.println("Is the given age is eligible for driving?" + isEligible);

		int a = 10;
		int b = 20;
		int c = 30;
		int max1 = (a > b) ? ((a > c) ? a : c) : (b > c) ? b : c;
		System.out.println("Max value is" + max1);

	}

}
