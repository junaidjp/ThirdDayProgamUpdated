package com.stringlearning;

public class StringTest {
	//Mutable and Immutable
	
	public static void main(String args[]) { 
		
		String name = "Maneesh";
		 name = name.concat("Singh");
		  name = name.substring(0, 10);
		  
		  
		  
		  StringBuilder nametemp = new StringBuilder("Maneesh");
		  nametemp.append("Singh");
		  
		
		
		System.out.println("My name is " + name);
		
		
	}

}
