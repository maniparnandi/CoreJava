package com.operators;

public class TestAssignmentOperator {

	public static void main(String[] args) {
		System.out.println("main method started");
		int result=5;
		//result=result+6.7;Type mismatch: cannot convert from double to int
		//result=(int)(result+6.7);
		result+=6.7;
		System.out.println(result);//11
		result-=3.9;
		System.out.println(result);//7
		result/=2.5;
		System.out.println(result);//2
		result%=2.5;
		System.out.println(result);//2
		}
	////Widening:Lower data type is going to store in highest data type
	////Narrowing:Higher data type is going to store in lower data type

}
