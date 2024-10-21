import java.util.Arrays;
public class week8 {
	public static void main(String args[])
	{
		double g[][] = {{0,1,2},{1,0,3},{2,3,0}}; 
		double mst[][] = MST.PrimsMST(g);
		PrintArray(mst);
		
		double h[][][][][] = {{0,1,2,3,0},{1,0,6,0,5},{2,6,0,4,1},{3,0,4,0,5},{0,5,1,2,0}}; 
	}
	
	public static void PrintArray(double[][] x)
	{
		System.out.println(Arrays.deepToString(x));
	}

}
