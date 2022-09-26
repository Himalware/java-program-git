package com.pro.array;

public class PalindromeString {
	
	public static void main (String []args) {
		
		String s = "MADAM";
		
		String reverse = "";
		
		for (int i=s.length()-1 ; i>=0 ; i--) {
			
			reverse = reverse + s.charAt(i);
			
		}
		
		if(s.equals(reverse)) {
			
			System.out.println("Palindrome :" +s);
			
		}else {
			
			System.out.println("Not a Palindrome :"+s);
		}
		
	}

	
}
