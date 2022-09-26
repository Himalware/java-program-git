package com.pro.sim;

public class JavaCoding {
	
	public static void main(String[] args) {
		int a=10 , b=20;
		
		//without third variable
		System.out.println("Before swapping the two numbers "+a+"  "+b);
		
//		a=a+b;//30
//		b=a-b;//20
//		a=a-b;//10
//		System.out.println("After swapping the two numbers "+a+"  "+b);
		
		//with third variable
		int k=a;
		a=b;
		b=k;
		System.out.println("After swapping the two numbers "+a+"  "+b);
		
//		
	}
  

	
	
}
