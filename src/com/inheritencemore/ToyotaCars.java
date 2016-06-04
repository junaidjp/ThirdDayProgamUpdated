package com.inheritencemore;

public class ToyotaCars extends Car{

	
	public String showModel() {
	
		System.out.println("TOYOTA CAMRY");
		 System.out.println("TOYOTA SOLARA");
		return "TOYOTA CAMRY , TOYOTA SOLARA";
	}

	@Override
	public String showModels() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
