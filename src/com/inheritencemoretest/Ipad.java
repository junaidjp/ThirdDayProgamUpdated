package com.inheritencemoretest;

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

	@Override
	public void memory() {
		System.out.println("This comes in 128GB,264GB");
		
	}

	@Override
	public void cameraPixel() {
		System.out.println("Comes in maximum 24 Pixels");
		
	}


}
