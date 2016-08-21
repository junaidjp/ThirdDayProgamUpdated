package com.inheritenceInterfacetest;

public class Ipad  implements AppleProducts,Electronic {

	public static void main(String args[]) {

		Ipad ipad = new Ipad();
		String typeofIpad = ipad.typeOfIPad();
	
		ipad.memory();
		ipad.cameraPixel();
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

	@Override
	public void typeofAdapter() {
		System.out.println("Ipad uses 60v Adapter");
		
	}


}
