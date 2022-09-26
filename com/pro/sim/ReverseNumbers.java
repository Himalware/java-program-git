package com.pro.sim;

import java.util.Scanner;

public class ReverseNumbers {
	
	public static void main (String args[]) {
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("Enter the number:");
		
		int n = s.nextInt();
		
		int a, i = 0 , j = 0;
		
		a = n;
		
		while (a>0) {// E.g : a = 123; i = 0; j = 0; || a = 12; i = 3; j = 3; || a = 1; i = 2; j = 32;
			
			i = a % 10; // i = 3;                || i = 2;                || i = 1;
			j = (j*10) + i ; // j = 3;           || j = 32;               || j = 321;
			a = a / 10 ;// a = 12 ;              || a = 1;                || a = 0;
			
		}
		
		System.out.println("The reversed number is = " + j);
	}

}
