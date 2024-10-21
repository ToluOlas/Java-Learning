import java.util.Scanner; 
public class tempConvert {
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);  
		System.out.println("Type in your temprature value");
		double temp = Double.parseDouble(in.nextLine());  
		System.out.println("What type of conversion would you like to do? Type 1 or 2 for:");
		System.out.println("");
		System.out.println("1. Celcius to Farenheit");
		System.out.println("2. Farenheit to Celcius");
		String option = in.nextLine();  
				
		switch(option){
		case "1":
			temp=(1.8*temp)+32; 
			System.out.println("In Farenheit: "+temp+"°F"); 
			break;
		case "2":
			temp=5*(temp-32)/9; 
			System.out.println("In Celcius: "+temp+"°C"); 
			break;
		default:
			System.out.println("Invalid option");
		}	
		
	}

}
