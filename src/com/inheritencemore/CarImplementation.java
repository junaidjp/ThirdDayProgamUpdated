package com.inheritencemore;

public class CarImplementation {
	
	public static void main(String args[]){
		Car hondaCar=new HondaCars();
		hondaCar.showModels();
		hondaCar.seats();
		Car toyotaCar=new ToyotaCars();
		toyotaCar.showModels();
		toyotaCar.seats();
	}

}
