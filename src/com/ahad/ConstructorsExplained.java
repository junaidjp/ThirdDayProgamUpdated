package com.ahad;

//Method overloading  Explained,this KeyWord
//Almost everyProgram in companies will have a Constructor
public class ConstructorsExplained {

	
	private String team="India";
	
	public ConstructorsExplained(){
		//The most simplest constructor
		System.out.println("Constructor was invoked");
	}
	
	   public ConstructorsExplained(String favSport,int noConstructors){
			System.out.println(favSport);
			System.out.println(noConstructors);
		}

	
	public ConstructorsExplained(String favSport){
		
		//Constructor with arguments
		System.out.println("My fav sport is "+favSport);
	}
	
	public ConstructorsExplained(String string, String string2, int i) {
		// TODO Auto-generated constructor stub
	}
	
	
	  public ConstructorsExplained(int noConstructors){
    	  this("hockey");
    	  System.out.println(this.team);
    	  System.out.println("There are about "+noConstructors+ " Constructors in this class");
    	  //this("hockey");
      }

	
	public static void main(String args[]){
		
		
		//this means Current - current method . current object 
		ConstructorsExplained object1 =new ConstructorsExplained(1);
		
		ConstructorsExplained conExplained=new ConstructorsExplained();
		
		
		conExplained=new ConstructorsExplained("Cricket",1);
		
		
		
	}
	
	
	public void showName(int i) {

       System.out.println("The parameter passed was" +i);
		
	}

	public String showName(String name){
		return name.concat(" pasha");
		
	}
	
        
          
          
          public  void showFavCricketTeam()
          {
        	  String favTeam =this.team;
       
          }
	
  

}
