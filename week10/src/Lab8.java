import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
public class Lab8 {
	public static void main(String args[])
	{
		
		int test =766/10;
		System.out.println(test);
		
	}
	
	public static void testFit() {
		ArrayList<Double> testweights = new ArrayList<Double>();
		testweights.add(1.0);
		testweights.add(2.0);
		testweights.add(3.0);
		testweights.add(4.0);
		testweights.add(10.0);
		
		double testFitness = ScalesSolution.ScalesFitness(testweights);	
		System.out.print(testFitness);
	}
	
	public static double ScalesFitness(ArrayList<Boolean> rep, ArrayList<Double> weights){
		if (rep==null || rep.isEmpty()) return(-100);
		if (weights==null || weights.isEmpty()) return(-100);
		if (rep.size() > weights.size()) return(-100);
		double lhs = 0.0,rhs = 0.0;
		int n = rep.size();
		for (int i=0;i<n;++i)
		{
			if (rep.get(i)==true)
			{
				lhs = lhs + weights.get(i);
			}
			else
			{
				rhs = rhs + weights.get(i);
			}
		}
		
		return(Math.abs(lhs-rhs));
	}
	
	public static String RandomBinaryString(int n)
	{
		String s = new String();
		if (n<=0) return(s);
		Random rand = new Random();
		for (int i=0;i<n;++i)
		{
			s = s + rand.nextInt(2);
		}
		return(s);
	}
	
	public static ArrayList<Integer> predictAnswer(ArrayList<Integer> stockData, ArrayList<Integer> queries) {
		ArrayList<Integer> ansArray = new ArrayList<Integer>();
        for(int i=0;i<queries.size();++i) {
        	int loop = 1;
        	int currentQuery=queries.get(i);
        	boolean validVal=false;
        	//while loop continues til both sides of query are outside of day 1 and the final day, OR if a lower value is found
        	while(currentQuery-loop>0 && currentQuery+loop<=stockData.size()) {//spiral loop
        		if(stockData.get(currentQuery-1)>stockData.get(currentQuery-1-loop)) {
        			ansArray.add(currentQuery-loop);
        			validVal=true;
        			break;
        		}
        		if(stockData.get(currentQuery-1)>stockData.get(currentQuery-1+loop)) {
        			ansArray.add(currentQuery+loop);
        			validVal=true;
        			break;
        		}
        		loop++;
        	}
        	while(currentQuery-loop>0 && validVal==false) {//linear loop for left side 
        		if(stockData.get(currentQuery-1)>stockData.get(currentQuery-1-loop)) {
    				ansArray.add(currentQuery-loop);
    				validVal=true;
    				break;
    			}
        		else {
        			loop++;
        		}
        	}
        	while(currentQuery+loop<=stockData.size()&& validVal==false) {//linear loop for right side
        		if(stockData.get(currentQuery-1)>stockData.get(currentQuery-1+loop)) {
    				ansArray.add(currentQuery+loop);
    				break;
    			}
        		else {
        			loop++;
        		}
        	}
        	if(ansArray.size()==i) {
        		ansArray.add(-1);
        	}
        }
        return ansArray;
    }
	
	
    public int solution(int N, int K) {
    	ArrayList<String> stringList = new ArrayList<String>();
    	String nString = Integer.toString(N);
    	for (int i=0;i<nString.length();i++) {
    		stringList.add((nString.charAt(i)));
    	}
    }
	        
	  
}
