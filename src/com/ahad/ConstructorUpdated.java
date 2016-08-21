package com.ahad;

public class ConstructorUpdated {
	
	public ConstructorUpdated(String name) {
		
		System.out.println("My name is "+name);
		
	}

	

	public ConstructorUpdated(String name,String city) {
		
		System.out.println("My name is "+name);
		System.out.println("I am from " +city);
		
	}
	public  ConstructorUpdated() {
		System.out.println("Constructor with no Argument passed");
	}

	public static void main(String args[]) { 
		
		ConstructorUpdated object = new  ConstructorUpdated();
		
		
		ConstructorUpdated object2 = new ConstructorUpdated("Prasoona");
		
		ConstructorUpdated object3 = new ConstructorUpdated("prasoona","hyderabad");
		
		printHobbes();
		
	}

	public static void printHobbes() {
		
		System.out.println("coding");
		
	}
	

}
