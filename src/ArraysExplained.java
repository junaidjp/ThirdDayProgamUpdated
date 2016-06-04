// 2 Dollars - Spot the difference between Array cars and CarsDup outputs and explain why there is a difference 
import java.util.Arrays;


//Declaring Array Variables
public class ArraysExplained {
	
	
	
	public static void main(String args[]){
	int[] cars;
	//int cars[]; is the same as above
	
	//Defining a Array 
	cars=new int[4];
	
	//Both the statements above can be combined into one Statment using 
	//int cars[]=new int[3];
	
	//Initialising a array 
	
	cars[0]=10;
	cars[1]=11;
	cars[2]=5;
	
	//All the 5 statement can be combined using
	
	int carsDup[]={10,11,5};
	
	//Accessing the values of Array 
	
	//Java Own method called 	
	//Arrays.fill(cars, 6);
	
	for(int i=0;i<cars.length;i++)
	{
		System.out.println("Iam displaying Cars the Array Index is " +i+ " "+cars[i]);
	}
	
	for(int i=0;i<carsDup.length;i++)
	{
		System.out.println(" ** Iam displaying CarsDup the ArrayIndex is " +i+ " " +carsDup[i]);
	}
	
	
	
	
	}
	
	

}
