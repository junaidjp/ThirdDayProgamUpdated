//Concat Operations,Arrays of String
package com.stringprograms;

public class StringSimple {
	public static void main(String args[])
	{
		String firstName="junaid";
		System.out.println("My FirstName is"+firstName);
		String lastName="";
		System.out.println("My LastName is"+lastName);
		lastName="pasha";
		System.out.println("My LastName now is"+lastName);
		System.out.println("My Full name is"+firstName.concat(lastName));
		System.out.println("My Full name is"+firstName+lastName);
		//You can also use firstName+lastName;
		//Arrays Of String explained

		
		String qualification[]={"Diploma CSE","BE CSE ","Masters CSE"};
		for(int i=0;i<qualification.length;i++){
			System.out.println(qualification[i]);
		}
	}

}
