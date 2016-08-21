package com.inheritencemoretest;

public class Iphone extends AppleProducts {

	public static void main(String args[]) {

		Iphone iphone = new Iphone();
		String typeofPhone = iphone.typeOfIphone();
		System.out.println(typeofPhone);
		String headquartered = iphone.companyName("Beijing");
		System.out.println(headquartered);
		iphone.stockValue();
		
		
		
	}

	public String typeOfIphone() {

		return "5s";
	}

	@Override
	public void memory() {
		System.out.println("This comes in 16GB,32GB,64GB");
		
	}

	@Override
	public void cameraPixel() {
		System.out.println("Comes in maximum 10 Pixels");
		
	}



}
