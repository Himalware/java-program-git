package com.pro.array;

public class AscendingOrder {

	public static void main (String [] args) {
		
int [] n = {10,20,70,90,60,30};
		
		int [] a = n;
		
		int  temp;
		
		for (int i=0 ;i< a.length ; i++) {
			
			for (int j = i+1 ; j < a.length ; j++) {
				
				if (a[i] > a[j]) {   // Change the condition only
					
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					
				}
			}
			
		}
		
            System.out.println("Ascending number");
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.println(a[i]);
			
			
		}
		
	    System.out.println("First Max Number");
				
				System.out.println(a[a.length-1]);	
			}
	}

		
		
		
	

