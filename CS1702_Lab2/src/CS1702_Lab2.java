
public class CS1702_Lab2 {
	public static void main(String args[])
	{
		long a = 100;
		double b = 2.3;
		double c = -52.2;
		boolean d = true;
		String e = "I am ";
		String f = "a student";
		long g = 0;
		char h = '!';
		final double pi = 3.142;
		final String name = "Tolu";
		long x;
		double y;
		String z;
		y = a + b;
		System.out.println(y);
		System.out.println("2 Invalid, cannot add a number to boolean");
		z = e + f;
		System.out.println(z);
		System.out.println("4 Invalid, multiplication must be done using *");
		System.out.println("5 Invalid, pi is a constant");
		System.out.println("6 Invalid, cannot divide a string, also cannot divide by 0");
		System.out.println("7 Invalid, cannot put a number into a string variable");
		x = 10;
		System.out.println(x*x*x);
		z = name + "is" + f + h;
		System.out.println(z);
		System.out.println("10 Invalid, cannot perform mathematical operations with a string");
		System.out.println("11 Invalid, cannot perform mathematical operations with boolean");
		y = 100.3;
		y = (y / (a + b)) - c;
		System.out.println(y);
		System.out.println("13 Invalid, cannot perform mathematical operations with a string");
		System.out.println("14 Invalid, name is a constant");
		y = ((pi + 1)/(pi + 2))/(pi + 3);
		System.out.println(y);

		
		
	}


}
