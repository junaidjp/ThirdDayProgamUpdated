package com.inheritenceInterface;

public class ToyotaCars implements Car{
	
public String price() {
		
		return "2700";
	}

	
	public String seats() {
		
		return "5 Seater";
	}

	
	public String showModels() {
		System.out.println("TOYOTA CAMRY");
		 System.out.println("TOYOTA SOLARA");
		return "TOYOTA CAMRY , TOYOTA SOLARA";

	}
	

}
