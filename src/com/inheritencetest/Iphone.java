package com.inheritencetest;

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



}
