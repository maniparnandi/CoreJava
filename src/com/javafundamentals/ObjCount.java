package com.javafundamentals;

public class ObjCount {
	static int count=0;
	ObjCount(){
		count++;
	}

	 void main() {
		 ObjCount o1=new ObjCount();
		 ObjCount o2=new ObjCount();
		 ObjCount o3=new ObjCount();
		 ObjCount o4=new ObjCount();
		 ObjCount o5=new ObjCount();
		 System.out.println("count:"+count);
		
	 }

}
