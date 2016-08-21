package com.polymorphism;

public class ToyotaCars extends Car {
	
	public static void main(String args[]){
		ToyotaCars toyCar=new ToyotaCars();
		toyCar.showWheels();
		toyCar.stereo();
		toyCar.seats();
		toyCar.showModels();
		
	}

	
	public ToyotaCars(){
		super("Toyota Cars");
	}
	private void showModels() {
		
		System.out.println("Toyota Camry");
		System.out.println("Toyota Corrolla");
		System.out.println("Toyota Prius");
		
	}

	
}
