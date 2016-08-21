package com.inheritencetest;

public class Ipad  extends AppleProducts {

	public static void main(String args[]) {

		Ipad ipad = new Ipad();
		String typeofIpad = ipad.typeOfIPad();
		System.out.println(typeofIpad);
		System.out.println(ipad.companyName("Hyderabad"));
		
		ipad.stockValue();
	
		
	}

	public String typeOfIPad() {
		return "Fourth Gen";
	}

	

}
