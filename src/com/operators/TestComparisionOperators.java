package com.operators;

public class TestComparisionOperators {

	public static void main(String[] args) {
		String s = "Manisharma";// String constant pool
		String s1 = new String("Manisharma");// heap
		String s2 = "Ram";// 2 places

		int a = 10;
		int b = 20;
		int c = 20;
		System.out.println(a == b);// false
		System.out.println(b == c);// true
		System.out.println(s == s1);// false
		System.out.println(s.equals(s1));// true
		System.out.println(s.equalsIgnoreCase(s1));// true

		System.out.println(a < b);// true
		System.out.println(b <= c);// true
		System.out.println(c >= a);// true
		System.out.println(b > c);// false
		System.out.println(b != a);// true

	}

}
