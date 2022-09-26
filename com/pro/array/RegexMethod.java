package com.pro.array;

public class RegexMethod {
	
	public static void main(String[] args) {
		
		String s = "hyut@$%1278AD";
		
		String k = s.replaceAll("[^a-zA-z0-9]", ""); // ^ is mentioned given work has to be done
		
		System.out.println(k);
	}

}
