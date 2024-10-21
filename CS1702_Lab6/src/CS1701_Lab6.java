import java.text.DecimalFormat;
import java.util.Random;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CS1701_Lab6 {
	public static void main(String args[]) throws IOException
	{
		double number = 1.0/3.0;
		DecimalFormat number_format = new DecimalFormat("#.##");
		System.out.println(number);
		String formatted_string = number_format.format(number);
		System.out.println(formatted_string);
		System.out.println("");
		System.out.println("6.3");
		Strings(); //6.3
		System.out.println("");
		System.out.println("6.4");
		RoundingTest(-100.9); //6.4
		System.out.println("");
		System.out.println("6.5");
		Files(); //6.5
		System.out.println("");
		System.out.println("6.6");
		RNG(); //6.6
		System.out.println("");
		System.out.println("6.7");
		readFile(); //6.7
	}
	
	public static void Strings() //6.3
	{
		double x = 123.456;
		double y = 17/3;
		double z = Math.sqrt(2);
		String a = "Hello";
		String b = "World";
		// 1.
		DecimalFormat ThreeDP = new DecimalFormat("#.###");
		System.out.println(ThreeDP.format(y));
		// 2.
		String q2 = String.valueOf(z);
		String chungus = "2543234.67854567890";
		int BD = chungus.indexOf(".");
		System.out.println("Numbers before decimal: "+BD);
		System.out.println(q2);
		int BeforeDecimal = q2.indexOf(".");
		System.out.println("Numbers before decimal: "+BeforeDecimal);	
		// 3.
		StringBuilder c = new StringBuilder();
		c.append(a);
		c = c.reverse();
		c.append(" "+b);
		System.out.println(c);
		// 4.
		System.out.println(c.replace(1,3, "ppp"));
	}
	
	public static void RoundingTest(double x) //6.4
	{
		double ceil = Math.ceil(x);
		double floor = Math.floor(x);
		double round = Math.round(x);
		String s = String.format("For %1$.2f ceil = %2$.2f floor = %3$.2f round = %4$.0f",x,ceil,floor,round);
		System.out.println(s);			
	}
	
	public static void Files() //6.5
	{
		String dir_name = "c:\\Users\\"; //Or another directory
		File dir = new File(dir_name);
		File[] dir_list = dir.listFiles();
		for(int i=0;i<dir_list.length;++i)
		{
			System.out.println(dir_list[i].getName());
		}
	}
	
	public static void RNG() //6.6
	{
		Random rand = new Random();
		int a = -100;
		int b = 100;
		for(int i=0;i<10;++i)
		{
			System.out.println(a + rand.nextInt(b-a+1));
		}
	}
	
	public static void readFile() throws IOException // 6.7
	{
	   FileReader readhandle = new FileReader("c:\\CS1702Files\\Billy Goats.txt");
	   BufferedReader br = new BufferedReader(readhandle);
	   String line = null;
	   int count = 0;
	   while((line = br.readLine()) != null)
	   {
	      System.out.println(line);
	      for(int i=0; i < line.length(); i++)
		   {    
			   if(line.charAt(i) == ' ' && line.charAt(i-1) != ' ') 
			   {
				   count = count+1;
			   }
		   }
		   count = count+1;
	   }
	   br.close();
	   readhandle.close();
	   System.out.println("Number of words: "+count);
		
	}

}
