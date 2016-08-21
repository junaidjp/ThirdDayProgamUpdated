package com.inheritence;

public class Iphone5s {

public static void main(String args[]) { 
		
		
		Iphone5s iphoneObject =  new Iphone5s();
		System.out.println(iphoneObject.memory());
		System.out.println(iphoneObject.modelName());
		
		
		
	}

	  public String memory() { 
		  
		  return "32 GB";
	  }
	  
	  
	  public String modelName() { 
		  
		  return "Iphone 5s";
	  }
	
}
