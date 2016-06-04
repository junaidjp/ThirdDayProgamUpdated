//Understand Null Check and CarType questions
public class MethodReturns {
	
	public static void main(String args[])
	{
		String toyCamry="camry";
		String honCivic="civic";
		String nisMax="maxima";
		System.out.println(calculateCars(toyCamry));
		//System.out.println(calculateCars(honCivic));
		//System.out.println(calculateCars(nisMax));
		//System.out.println(calculateCars("ford"));
		
	}

	private static String calculateCars(String carType) {
		
		if(carType==null)
		{
		  return "We do not have any cars in inventory";	
		}
		if(carType.equals("camry"))
		{
			return "We have 4 camry in inventory";
		}
		if(carType.equals("civic"))
		{
			return "We have 3 civic in inventory";
		}
		
		if(carType.equals("maxima"))
		{
			return "We have 5 maxima in inventory";
		}
		
		return "You did not send anything valid Or we do not sell that car";
		
	}

}
