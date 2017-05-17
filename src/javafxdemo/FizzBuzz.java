package javafxdemo;

import java.util.ArrayList;

public class FizzBuzz {
    
	
	
	public static void display(int n){
		
		ArrayList<String> al = new ArrayList<>(n);
		
		for(int i = 1; i <= n; i++){
		if( i % 3 == 0 && i % 5 == 0)
			al.add("FizzBuzz");
		else if(i % 3 == 0)
			al.add("Fizz");
		else if ( i % 5 == 0)
			al.add("Buzz");
		else 
			al.add(i + "");
		}
		
		
		
		for(String m: al)
	    	  System.out.println(m + " ");
			
	}
	
	
}

