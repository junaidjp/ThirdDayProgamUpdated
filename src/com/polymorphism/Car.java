package com.polymorphism;

public class Car {
	
	public static String wheels;
	public String stereo;
	public String tires;
	public String seats;
	private String color;
	protected String horsepower;
	
	
	
	protected String horsePower(String horsePower)
	{
		return "THE HORSE POWER IS "+horsepower;
	}
	
	public Car(String childCar) {
		
		System.out.println("This super class was just called by "+childCar);
	}
	

	public String showWheels(){
		return "Cars have 4 wheels";
		
	}
	
	public String stereo()
	{
		return "Cars always a stereo";
	}
	
	public String tires(){
		return "Cars have 4 tires";
	}
	public String seats() { 
		return "Cars have a seat";
	}
	
	
	public String showColor(String carColor){
		System.out.println("Color of the car is"+carColor);
		return "CAR COLOR IS "+carColor;
	}

}
