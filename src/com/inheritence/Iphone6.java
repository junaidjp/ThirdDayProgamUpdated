package com.inheritence;

import com.ahad.AppleProducts;
import com.ahad.Electronics;

public class Iphone6  extends AppleProducts {
	
	
	public static void main(String args[]) { 
		
		
		Iphone6 iphoneObject =  new Iphone6();
		System.out.println(iphoneObject.memory());
		System.out.println(iphoneObject.modelName());
		System.out.println(iphoneObject.locationofCompany());
		System.out.println(iphoneObject.nameofCompany());
		
		Electronics electronic  = new Electronics();
		System.out.println(electronic.adapterType());
	//	electronic.makeofthisproduct();
		
		
		
		
	}

	  public String memory() { 
		  
		  return "64 GB";
	  }
	  
	  
	  public String modelName() { 
		  
		  return "Iphone 6";
	  }
}
