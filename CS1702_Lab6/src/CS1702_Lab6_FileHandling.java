import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CS1702_Lab6_FileHandling {
	public static void main(String args[]) throws IOException
	{
	   FileWriter writehandle = new FileWriter("c:\\CS1702Files\\file.txt");

	   BufferedWriter bw = new BufferedWriter(writehandle);
	   for(int i=0;i<10;++i)
	   {
	      String line = "Hello " + i;
	      bw.write(line);
	      bw.newLine();
	   }
	   bw.close();
	   writehandle.close();
	   readFile();
	}
	
	public static void readFile() throws IOException
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
			   if(line.charAt(i) == ' ') 
			   {
				   count = count+1;
			   }
		   }
		   count = count+1;
	   }
	   br.close();
	   readhandle.close();
	   System.out.println(count);
		
	}

	


}
