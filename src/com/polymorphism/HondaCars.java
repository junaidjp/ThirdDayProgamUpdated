package com.polymorphism;

public class HondaCars extends Car {

	public static void main(String args[]){
		HondaCars hondaCar=new HondaCars();
		hondaCar.showWheels();
		hondaCar.stereo();
		hondaCar.seats();
		//hondaCar.color="RED";
		hondaCar.horsepower="220";
		System.out.println(hondaCar.horsePower(hondaCar.horsepower));
		hondaCar.showModels();
		
	}

	
	public HondaCars()
	{
		super("WORKING WITH HONDA");
	}
	private void showModels() {
		
		System.out.println("Honda  Civic");
		System.out.println("Honda accord");
		System.out.println("Honda CLX");
	    	
		
	}
	

	

}
