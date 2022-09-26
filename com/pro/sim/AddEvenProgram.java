package com.pro.sim;

public class AddEvenProgram {
	
	public static void main (String args[]) {
		
		int count = 0 , count1 = 0;
		
		for(int i=0; i<=100; i++) {
			
			if(i%2 ==0) {
				
				System.out.println("even number is"+ i);
				
			count = count + 1;
			
			}else {
				
				System.out.println("the odd number is"+ i);
				
				count1 = count + 1;
			}
			
		}
		
		System.out.println("total number of even" +count);
		System.out.println("total number of odd"  +count1);
	}

}
