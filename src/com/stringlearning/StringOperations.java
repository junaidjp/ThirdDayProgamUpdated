package com.stringlearning;
//String Operations , Substring,Splitting,replacing ,Immutable Concepts
public class StringOperations {
	
	public static void main(String args[])
	{
		
		
		String hondaCar="HondaAcura";
         System.out.println(displayModel(hondaCar));
         String toyotaCarhasSpaces="Toyota Camry      ";
         System.out.println("BEfore removing spaces "+toyotaCarhasSpaces);
         System.out.println("AFter removing spaces " +toyotaCarhasSpaces.trim());
         String aboutToyotaCar="Toyota are one of the best cars in the USA,JAPAN,CHINA";
        displaySplits(aboutToyotaCar);
        displayReplaceToyotaByHonda(aboutToyotaCar);//Replace Method
		
		
	}
	
	private static void displayReplaceToyotaByHonda(String stringvarialges) {
		System.out.println("Origincal Message(aboutToyotaCar) is"+ stringvarialges);
		System.out.println("Changed Message(aboutToyotaCar) is " + stringvarialges.replace("Toyota", "Honda"));
		System.out.println("Original Message(aboutToyotaCar) is STILL IS "+stringvarialges+" because String are Immutable Objects (Original value does not change until you assign it to itself) ");
		stringvarialges=stringvarialges.replace("Toyota", "Honda");//Understand this Line
		System.out.println("NOW Original Message (aboutToyotaCar)"+stringvarialges);
	}

	private static void displaySplits(String aboutToyotaCar) {
		
		String aboutToyotaCarArray[]=aboutToyotaCar.split("[,]", 0);
		displayToyotaArray(aboutToyotaCarArray);
		
		
	}

	private static void displayToyotaArray(String[] aboutToyotaCarArray) {
		for(int i=0;i<aboutToyotaCarArray.length;i++){
			System.out.println(aboutToyotaCarArray[i]);
		}
		
	}

	public static String displayModel(String modelCar){
		
		return modelCar.substring(4);
		
	}

}
