import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class CS1702_Lab3 {
	public static void main(String args[])
	{
	   int x = 100,y = 204,c = -204,z = 150;
	   double d = -23.1;
	   boolean a = true,b = false;
	   if (x < y)
	   {
		   System.out.println("x is less than y");
	   }
	   else
	   {
		   System.out.println("x is NOT less than y");
	   }
	   if ((x > z) && (a == b))
	   {
		   System.out.println("x is greater than Z AND a is equal to b");
	   }
	   else
	   {
		   System.out.println("x isn't greater than Z OR a isn't equal to b");
	   }  
	   NumSort(11,8,9);
	   System.out.println("");
	   DivTwoThree(4);
	  
	   int[] pog = ThreadLocalRandom.current().ints(2, 90).distinct().limit(5).toArray();
	   System.out.println(Arrays.toString(pog));
	   
	   Random rand = new Random();
	   int rnd = rand.nextInt(100) + 1; //a random number from 1 to 100 is chosen
	   while (rnd>10) {
		   System.out.println(rnd);
		   rnd = rand.nextInt(100) + 1;
	   }
	   System.out.println(rnd);
	   
	   System.out.println(MakeSequence(-1));
	   System.out.println(ThreeDecimalPlaces(56543456.567896534950));
	   System.out.println(HowManyDigitsBeforeF(65543.4F));
	   System.out.println(FactorialD((short)5));
	   
	   int[][] test = {{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0}};

	   int row = test.length;
	   int col = test[0].length;

	   System.out.println(row);
	   System.out.println(col);
	}
	
	public static void NumSort(int x,int y,int z)
	{
		if (x >= y)
		{
			if (y >= z)
			{
				System.out.print(x);
				System.out.print(" >= ");
				System.out.print(y);
				System.out.print(" >= ");
				System.out.print(z);
			}
			else if (x >= z)
			{
				System.out.print(x);
				System.out.print(" >= ");
				System.out.print(z);
				System.out.print(" >= ");
				System.out.print(y);
			}
			else
			{
				System.out.print(z);
				System.out.print(" >= ");
				System.out.print(x);
				System.out.print(" >= ");
				System.out.print(y);
			}
		}
		else if (x >= z)
		{
			System.out.print(y);
			System.out.print(" >= ");
			System.out.print(x);
			System.out.print(" >= ");
			System.out.print(z);
		}
		else if (y >= z)
		{
			System.out.print(y);
			System.out.print(" >= ");
			System.out.print(z);
			System.out.print(" >= ");
			System.out.print(x);
		}
		else 
		{
			System.out.print(z);
			System.out.print(" >= ");
			System.out.print(y);
			System.out.print(" >= ");
			System.out.print(x);
		}
	}
	
	public static void DivTwoThree(int x)
	{
		System.out.println((((x % 2)==0)&&((x % 3)==0))?"Divisible by 2 and 3":"Nah");
		
	}
	
	public static ArrayList<Integer> MakeSequence(int N){
		ArrayList<Integer> Sequence = new ArrayList<Integer>();
	    if (N<1)
	    {
	        return Sequence;
	    }
	    else
	    {
	        int counter=0;
	        for (int i=N;i>0;--i)
	        {
	            counter=counter+1;
	            for (int j=1;j<=i;++j)
	            {
	                Sequence.add(counter);
	            }
	        }
	    }
	    return Sequence;
	}
	
	public static String ThreeDecimalPlaces(double Number){
	    DecimalFormat df = new DecimalFormat("#.000");
		return df.format(Number);
	}
	
	public static short HowManyDigitsBeforeF(float Number){
		System.out.println(Number);
	    String Num = String.valueOf(Number);
	    System.out.println(Num);
	    int x = Num.indexOf(".");
	    System.out.println("Best not be buggin: "+x);
	    return (short)x;
	}
	
	public static short FactorialD(short Number){
		int intNum = Number;
		int counter = 1;
		if (intNum<0)
		{
			return (short)-4;
		}
		else
		{
			for (int i=1;i<=intNum;++i)
			{
				counter=counter*i;
			}
		}
		return (short)counter;
	}
	
	 
	
	
	


}
