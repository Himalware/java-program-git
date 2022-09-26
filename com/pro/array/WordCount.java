package com.pro.array;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
	
	public static void main(String[] args) {
		
		String s = "No Fear No limits No excuses";
		
	Map<String, Integer> m = new HashMap<>();
	
	String [] split = s.split("");
	
	for (String x : split) {
		
		if(m.containsKey(x)) {
			
			Integer i = m.get(x);
			m.put(x,i+1);
			
			
		}else {
			
			m.put(x,1);
		}
		
	}
	
	System.out.println(m);
}
	
	
	

}
