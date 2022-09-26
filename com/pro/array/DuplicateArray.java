package com.pro.array;

public class DuplicateArray {
	
	public static void main (String [] args) {

		int [] n = {10,20,70,90,10,30};
		
		int [] a = n;
		
		
		for (int i=0 ;i< a.length ; i++) {
			
			for (int j = i+1 ; j < a.length ; j++) {
				
				if (a[i] == a[j]) {   // Change the condition only
					
					System.out.println(a[j]);
					
				}
	}
}	
	
	}

}
	
	

