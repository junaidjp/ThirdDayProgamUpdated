package com.ahad;

public class ConstructorTest {
	
	public  ConstructorTest(String name) { 
	System.out.println("My name is " + name);
	}
	
	public ConstructorTest(String name,String place) { 
		System.out.println("My name is " + name);
		System.out.println("Iam from " + place);
	}
	
	
	public static void main(String args[]) { 
		
	           //  ConstructorTest object = new ConstructorTest();	
	               
	      ConstructorTest object1 = new ConstructorTest("Maneesh");
	      
	      ConstructorTest object2 = new ConstructorTest("Maneesh","Hyderabad");
	      
		
		
		
		
		
	}

	
	
}
