import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random; 
public class week6 {
	
	
	public static void main(String args[])
	{
		//ArrayList<Integer> arr = new ArrayList<Integer>();
		//arr = RandomArray(10);
		//ShowArray(arr);
		//System.out.println(ThreeSorts.SortA(arr));
		//System.out.println("");
		//arr = RandomArray(10);
		//ShowArray(arr);
		//System.out.println(ThreeSorts.SortB(arr));
		//System.out.println("");
		//arr = RandomArray(10);
		//ShowArray(arr);
		//System.out.println(ThreeSorts.SortC(arr)); 
		//System.out.println("CSII");
		//System.out.println(RandomArray(10,(short)100,(short)95));
		PrintArray(RandomMatrix(5,1,5));
	}
	
	public static ArrayList<Integer> RandomArray(int n)
	{
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int i=0; i<n; i++) {
			Random rand = new Random();
			numbers.add(rand.nextInt(255) + 1);
		}
		return numbers;
	}
	
	public static void ShowArray(ArrayList<Integer> x)
	{
		System.out.println(x);
	}
	
	public static ArrayList<Float> PrefixAverage(ArrayList<Float> X){
	    if (X==null || X.isEmpty())
	    {
	    	return null;
	    }
	    else
	    {
	    	ArrayList<Float> prefixed = new ArrayList<Float>();
	    	float total = 0;
	    	int n = X.size();
	    	for (int i=0; i<n;i++)
	    	{
	    		total = total+X.get(i);
		    	prefixed.add(total/(i+1));
	    	}
	    	return prefixed;
	    }

	}
	
	public static ArrayList<Short> RandomArray(int n, short maxVal, short minVal){
		if (n <= 0)
		{
			return null;
		}
		ArrayList<Short> randArr = new ArrayList<Short>();
		short randShort;
		if (minVal > maxVal)
		{
			return randArr;
		}
		else
		{
			Random rand = new Random();
			for (int i=0;i<n;i++){
				randShort = (short)(rand.nextInt(maxVal-minVal+1)+minVal);
				randArr.add(randShort);			
			}
			return randArr;
		}
	}
	
	public static int[][] RandomMatrix(int n, int lower, int upper){
		if (n <= 0 || lower>upper)
		{
			return null;
		}
		int[][] matrix= new int[n][n];
		Random rand = new Random();
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				if (i==j)
				{
					matrix[i][j]=lower;
				}
				else
				{
					if (j>i)
					{
						matrix[i][j]=rand.nextInt(upper-lower+1)+lower;
					}
					else
					{
						matrix[i][j]=matrix[j][i];
					}	
				}
			}
		}
		return matrix;
	}
	
	public static void PrintArray(int[][] x)
	{
		System.out.println(Arrays.deepToString(x));
	}
	

}
