
public class tasktest {

	public static void main(String[] args) {
		System.out.println(FrequencyCode_Q5("b"));
	}
	
	public static boolean checkChar(char input)//checks if a character is a letter
	{
		return Character.isLetter(input);
	}
	
	public static boolean subCheck(String sub)//checks if a string is viable to be a key
	{
		sub = sub.toLowerCase();
		char[] alphabet = {'q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m'};
		if (sub.isEmpty() == true)
		{
			System.out.println("Empty");
			return false;
		}
		else if (sub.length() != 26)
		{
			return false;
		}
		else
		{
			for (int i=0;i<26;++i)
			{
				if (sub.indexOf(alphabet[i])==-1)
				{
					return false;
				}
			}
		}
		return true;
	}
	
	public static String encodeStr(String message, String key)//encodes a message using a given key
	{
		if (message.isEmpty() == true || key.isEmpty() == true)
		{
			return "null";
		}
		message = message.toLowerCase();
		String newStr = "";
		for (int i=0;i<message.length();++i)
		{
			switch (message.charAt(i)) {
			case 'a':
				newStr = newStr + key.charAt(0);
				break;
			case 'b':
				newStr = newStr + key.charAt(1);
				break;
			case 'c':
				newStr = newStr + key.charAt(2);
				break;
			case 'd':
				newStr = newStr + key.charAt(3);
				break;
			case 'e':
				newStr = newStr + key.charAt(4);
				break;
			case 'f':
				newStr = newStr + key.charAt(5);
				break;
			case 'g':
				newStr = newStr + key.charAt(6);
				break;
			case 'h':
				newStr = newStr + key.charAt(7);
				break;
			case 'i':
				newStr = newStr + key.charAt(8);
				break;
			case 'j':
				newStr = newStr + key.charAt(9);
				break;
			case 'k':
				newStr = newStr + key.charAt(10);
				break;
			case 'l':
				newStr = newStr + key.charAt(11);
				break;
			case 'm':
				newStr = newStr + key.charAt(12);
				break;
			case 'n':
				newStr = newStr + key.charAt(13);
				break;
			case 'o':
				newStr = newStr + key.charAt(14);
				break;
			case 'p':
				newStr = newStr + key.charAt(15);
				break;
			case 'q':
				newStr = newStr + key.charAt(16);
				break;
			case 'r':
				newStr = newStr + key.charAt(17);
				break;
			case 's':
				newStr = newStr + key.charAt(18);
				break;
			case 't':
				newStr = newStr + key.charAt(19);
				break;
			case 'u':
				newStr = newStr + key.charAt(20);
				break;
			case 'v':
				newStr = newStr + key.charAt(21);
				break;
			case 'w':
				newStr = newStr + key.charAt(22);
				break;
			case 'x':
				newStr = newStr + key.charAt(23);
				break;
			case 'y':
				newStr = newStr + key.charAt(24);
				break;
			case 'z':
				newStr = newStr + key.charAt(25);
				break;
			default:
				newStr = newStr + message.charAt(i);
				break;
			}
		}
		return newStr;
	}
	
	public static String reverseStr(String key)//letters position > positions letter (e.g Z in space 0 = A in space 25)
	{
		if (key == null || key.length() == 0)
	    {
	        return null;
	    }
		String alpha="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] rev = new char[26];
		String reverse="";
		for (int i=0;i<key.length();++i)
		{
			//position of key.charAt(i) = alpha.indexOf(key.charAt(i))
			//letter of i = alpha.charAt(i)
			rev[alpha.indexOf(key.charAt(i))] = alpha.charAt(i);
		}
		for (int i=0;i<key.length();++i)
		{
			reverse = reverse+rev[i];
		}
		return reverse;
	}
	
	public static String computeStr(String input)//orders letters by frequency
	{
		String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String output ="";
		int[] counts = new int[26];
		input = input.toUpperCase();
		for (int i=0;i<input.length();++i)
		{
			counts[alpha.indexOf(input.charAt(i))]=counts[alpha.indexOf(input.charAt(i))] + 1;
		}
		int max=0;
		int maxIndex=0;
		for (int i=0;i<26;++i)
		{
			max=0;
			maxIndex=0;
			for (int j=0; j<26;++j)
			{
				if (counts[j]>max)
				{
					max=counts[j];
					maxIndex=j;
				}
			}
			output=output+alpha.charAt(maxIndex);
			counts[maxIndex]=-1;
		}
		return output;
		
	}
	
	public static String Encode_Q3(String message, String subcode)
	{
	    if (message.length() == 0 || subcode.length() == 0 || message == null || subcode == null)
		{
			return null;
		}
		
	    String subTest = subcode.toLowerCase();
		char[] alphabet = {'q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m'};
		if (subTest.isEmpty() == true)
		{
			return null;
		}
		if (subTest.length() != 26)
		{
			return null;
		}
	
		for (int i=0;i<26;++i)
			{
				if (subTest.indexOf(alphabet[i])==-1)
				{
					return null;
				}
			}	
		
		
		message = message.toLowerCase();
		subcode = subcode.toUpperCase();
		
		String newStr = "";
		for (int i=0;i<message.length();++i)
		{
			switch (message.charAt(i)) {
			case 'a':
				newStr = newStr + subcode.charAt(0);
				break;
			case 'b':
				newStr = newStr + subcode.charAt(1);
				break;
			case 'c':
				newStr = newStr + subcode.charAt(2);
				break;
			case 'd':
				newStr = newStr + subcode.charAt(3);
				break;
			case 'e':
				newStr = newStr + subcode.charAt(4);
				break;
			case 'f':
				newStr = newStr + subcode.charAt(5);
				break;
			case 'g':
				newStr = newStr + subcode.charAt(6);
				break;
			case 'h':
				newStr = newStr + subcode.charAt(7);
				break;
			case 'i':
				newStr = newStr + subcode.charAt(8);
				break;
			case 'j':
				newStr = newStr + subcode.charAt(9);
				break;
			case 'k':
				newStr = newStr + subcode.charAt(10);
				break;
			case 'l':
				newStr = newStr + subcode.charAt(11);
				break;
			case 'm':
				newStr = newStr + subcode.charAt(12);
				break;
			case 'n':
				newStr = newStr + subcode.charAt(13);
				break;
			case 'o':
				newStr = newStr + subcode.charAt(14);
				break;
			case 'p':
				newStr = newStr + subcode.charAt(15);
				break;
			case 'q':
				newStr = newStr + subcode.charAt(16);
				break;
			case 'r':
				newStr = newStr + subcode.charAt(17);
				break;
			case 's':
				newStr = newStr + subcode.charAt(18);
				break;
			case 't':
				newStr = newStr + subcode.charAt(19);
				break;
			case 'u':
				newStr = newStr + subcode.charAt(20);
				break;
			case 'v':
				newStr = newStr + subcode.charAt(21);
				break;
			case 'w':
				newStr = newStr + subcode.charAt(22);
				break;
			case 'x':
				newStr = newStr + subcode.charAt(23);
				break;
			case 'y':
				newStr = newStr + subcode.charAt(24);
				break;
			case 'z':
				newStr = newStr + subcode.charAt(25);
				break;
			default:
				newStr = newStr + message.charAt(i);
				break;
			}
		}
		return newStr;
	}
	
	public static String RevCode_Q4(String subcode)
	{
	    if (subcode == null || subcode.length() == 0)
	    {
	        return null;
	    }
	    
	    String subTest = subcode.toLowerCase();
		char[] alphabet = {'q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m'};
		if (subTest.isEmpty() == true)
		{
			return null;
		}
		if (subTest.length() != 26)
		{
			return null;
		}
		
		for (int i=0;i<26;++i)
			{
				if (subTest.indexOf(alphabet[i])==-1)
				{
					return null;
				}
			}
	    subcode = subcode.toUpperCase();
		String alpha="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] rev = new char[26];
		String reverse="";
		for (int i=0;i<subcode.length();++i)
		{
			rev[alpha.indexOf(subcode.charAt(i))] = alpha.charAt(i);
		}
		for (int i=0;i<subcode.length();++i)
		{
			reverse = reverse+rev[i];
		}
		return reverse;
	}
	
	public static String FrequencyCode_Q5(String largeamountoftext)
	{
	    if (largeamountoftext == null || largeamountoftext.length() == 0)
	    {
	        return null;
	    }

		String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String output ="";
		int[] counts = new int[26];
		largeamountoftext = largeamountoftext.toUpperCase();
		for (int i=0;i<largeamountoftext.length();++i)
		{
			counts[alpha.indexOf(largeamountoftext.charAt(i))]=counts[alpha.indexOf(largeamountoftext.charAt(i))] + 1;
		}
		int max=0;
		int maxIndex=0;
		for (int i=0;i<counts.length;++i)
		{
			max=0;
			maxIndex=0;
			for (int j=0; j<counts.length;++j)
			{
				if (counts[j]>=max)
				{
					max=counts[j];
					maxIndex=j;
				}
			}
			output=output+alpha.charAt(maxIndex);
			counts[maxIndex]=-1;
		}
		return output;
		
	}

}

//if (subcode == null || subcode.length() == 0)
//{
   // return null;
//}

//String subTest = subcode.toLowerCase();
//char[] alphabet = {'q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m'};
//if (subTest.isEmpty() == true)
//{
	//return null;
//}
//if (subTest.length() != 26)
//{
	//return null;
//}

//for (int i=0;i<26;++i)
	//{
		//if (subTest.indexOf(alphabet[i])==-1)
		//{
			//return null;
		//}
	//}
//subcode = subcode.toUpperCase();
