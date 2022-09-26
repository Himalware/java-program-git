package com.pro.sim;

public class FactorialNumber {
	
	public static void main (String args[]) {
		
		int count = 1;
		
		for (int i=1; i<=9 ; i++) {
			
			count = count * i ;
		}
		
		System.out.println(count);
	}
}
