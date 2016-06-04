package com.inheritenceInterface;

public class HondaCars implements Car,Vehicle {

	
	public String price() {
		
		return "2200";
	}

	
	public String seats() {
		
		return "4 Seater";
	}

	
	public String showModels() {
		System.out.println("HONDA CIVIC");
		 System.out.println("HONDA ACCORD");
		return "HONDA CIVIC,HONDA ACCORD";
	}


	
	public String showTires() {
		
		return null;
	}
	

}
