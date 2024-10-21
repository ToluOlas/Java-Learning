import java.time.LocalDate;
import java.time.Month;

public class CS1702_Lab7 {
	
	public static void main(String args[]) 
	{
		System.out.println(Reverse("Hello, my name is Tolu"));
		DaysAlive(18,7,2001);
		System.out.println(Fibonacci(17));
		System.out.println(Fib(17));
		System.out.println(Factorial(33));
		System.out.println(CharCount('a',"abra kadabra",0)); //letter,string,counter (always 0)
		String a = "tacocat";
		System.out.println(Palindrome(0,a.length()-1,a));
		System.out.println(M(-123)); //the value is 91 for any number below 101
	
	}
	
	public static boolean EvenOdd(int x) 
	{
		if (x%2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static String Reverse(String x) 
	{
		StringBuilder a = new StringBuilder();
		a.append(x);
		a = a.reverse();
		x = a.toString();
		return x;
	}
	
	public static boolean LeapYear(double x) 
	{
		if (x%4==0)
		{
			if (x%100==0)
			{
				if (x%400==0)
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			else
			{
				return true;
			}
		}
		else
		{ 
			return false;
		}
	}
	
	public static int DaysInMonth(int x, int y) 
	{
		if (x == 1 || x == 3 || x== 5 || x==7 || x == 8 || x == 10 || x == 12)
		{
			return 31;
		}
		else if (x == 4 || x == 6 || x == 9 || x ==11)
		{
			return 30;
		}
		else if (x == 2)
		{
			if (LeapYear(y) == true)
			{
				return 29;
			}
			else
			{ 
				return 28;
			}
		}
		else
		{
			return 0;
		}
	}
	
	public static void DaysAlive(int x, int y, int z) 
	{
		LocalDate currentdate = LocalDate.now();
	    int currentDay = currentdate.getDayOfMonth();
	    Month MonthName = currentdate.getMonth();
	    int currentMonth = MonthName.getValue();
	    int currentYear = currentdate.getYear();
	    int counter = 0;
	    
	    //to add all days from day of birth to the end of the month of birth
	    counter = counter + (DaysInMonth(y,z)-x);
	    //to add all months from month of birth to the end of year of birth
	    for (int i=y+1;i<13;++i)
	    {
	    	counter = counter + DaysInMonth(i,z);
	    }
	    //to add all years from year or birth to current year
	    for (int i=z+1;i<currentYear;++i)
	    {
	    	if (LeapYear(i)==true)
				counter = counter + 366;
			else
				counter = counter + 365;    	
	    }
	    //to add all months from start of current year to month before current month
	    for (int i=1;i<currentMonth;++i)
	    {
	    	counter = counter + DaysInMonth(i,currentYear);
	    }
	    //to add all days passed in current month
	    counter = counter + currentDay;
	    
	    System.out.println("Days since entered date: "+counter);
	}
	
	public static int Fibonacci(int x) 
	{
		if (x<3 && x>=1)
		{
			return 1;
		}
		else if (x==0)
		{
			return 0;
		}
		else if (x<0)
		{
			System.out.println("ERROR: Integer entered below 0");
			return -1;
		}
		else
		{
			int f1=1;
			int f2=1;
			int temp=0;
			
			for (int i=3;i<=x;++i)
			{
				temp=f2+f1;
				f1=f2;
				f2=temp;
			}
			return temp;
		}
	}
	
	public static int Factorial(int x) //Cap seems to be 33
	{
		if (x==0)
		{
			return 1;    
		}
		else 
		{
			return(x*Factorial(x-1));
		}
		    
	}
	
	public static int Fib(int x)
	{
		if (x==1||x==2)
		{
			return 1;
		}
		else if (x<0)
		{
			System.out.println("ERROR: Integer entered below 0");
			return -1;
		}
		
		else
		{
			return Fib(x-1) + Fib(x-2);
		}
	}
	
	public static int CharCount(char x, String y, int z)
	{
		if (z==y.length())
		{
			return 0;
		}
		else
		{
			if (y.charAt(z) == x)
			{
				return CharCount(x,y,z+1) + 1;
			}
			else
			{
				return CharCount(x,y,z+1) + 0;
			}
		}
		
	}
	
	public static boolean Palindrome(int x, int y, String z)
	{
		if (x==y)
		{
			return true;
		}
		else if (z.charAt(x)==z.charAt(y))
		{
			return Palindrome(x+1,y-1,z);
		}
		else
		{
			return false;
		}
	}
	
	public static int M(int x)
	{
		if (x > 100)
		{
			return x-10;
		}
		else
		{
			return M(M(x+11));
		}
	}

}
