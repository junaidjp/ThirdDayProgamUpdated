package com.stringlearning;


/**
 * StringBuffer and StringBuilder are mutable Objects (Original can be changed without reassiging)
 * You have the choice of using either a StringBuffer object or a StringBuilder object whenever you
need a string that you can change directly,The difference
StringBuffer are ThreadSafe and StringBuilder are not 
 *
 */
public class StringOperationsTwo {
	
	public static void main(String args[])
	{
		
		explainStringBufferConcept();
		explainStringBuilder();
		
	}

	private static void explainStringBufferConcept() {
		String toyotaString="Toyota cars";
		//String toyotaString2=new String("Toyota Cars");
		System.out.println("Calling explainStringBufferConcept");
		StringBuffer aToyotaString = new StringBuffer("Toyota cars");
		aToyotaString.append(" are the best ");//ToyotaCars are the best
		String sampleString="car in the USA, India , China ";
		aToyotaString.append(sampleString);//Toyotcar are the best car in the USA,India,China
		System.out.println(aToyotaString);
		System.out.println("finished Invoking StringBufferConcept");
		
	}
	
	
	private static void explainStringBuilder() { 
	 System.out.println("Calling String Builder Concepts");
		StringBuilder aToyotaString=new StringBuilder("Toyota cars");
		aToyotaString.append(" are the best ");
		String sampleString="car in the USA, India , China ";
		aToyotaString.append(sampleString);
		System.out.println(aToyotaString);		
		System.out.println("finished Invoking StringBuilderConcepts");
	}
	
	
	

}
