package com.pro.array;

public class ReverseString2 {
	
	public static void main (String []args) {
		
		String s = "Nilavu Vidyut i am";
		
		String[] c = s.split("");
		
		for (int i=c.length-1 ; i>=2 ; i--) {
			
		System.out.print(c[i]);
			
		}
		
		for (int i = 0; i>=1; i++) {
			
			System.out.println(c[i]);
			
		}
		}
		
	}


