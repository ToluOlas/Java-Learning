import java.util.ArrayList;
import java.util.Random;

public class CS2004Task2 {
	public static void main(String args[]){
		ArrayList<Integer> pleasework = new ArrayList<Integer>();
		pleasework.add(5);
		pleasework.add(6);
		pleasework.add(8);
		pleasework.add(4);
		pleasework.add(9);
		pleasework.add(10);
		pleasework.add(8);
		pleasework.add(3);
		pleasework.add(6);
		pleasework.add(4);
		
		ArrayList<Integer> please = new ArrayList<Integer>();
		please.add(6);
		please.add(5);
		please.add(4);
		please.add(7);
		please.add(8);
		
		ArrayList<Integer> test = new ArrayList<Integer>();
		test=predictAnswer(pleasework, please);
		for(int x=0;x<test.size();++x) {
			System.out.println(test.get(x));
		}
		
		
	}
	
	
	public static boolean IsValidMDG(int[][] MDG)
	{
		if (MDG==null || MDG.length==0)
	    {
	    	return false;
	    }
		
		for(int i=0;i<MDG.length;i++) {
			if(MDG[i].length!=MDG.length) {//checks if matrix is n by n
				return false;
			}
			for(int j=0;j<MDG.length;j++) {
				if(MDG[i][j]!=0 && MDG[i][j] !=1) {//checks if value is 0 or 1
					return false;
				}
				if(i==j) {
					if(MDG[i][j] == 1) {//checks for nodes that connect to themselves
						return false;
					}
				}
				if(MDG[i][j] != MDG[j][i]) {//check for symmetry
					return false;
				}
			}
		}
		return true;
	}
	
	public static ArrayList<Integer> StartingPoint(int[][] MDG)
	{
		ArrayList<Integer> vector = new ArrayList<Integer>();
		for(int i=0;i<MDG.length;i++) {
			vector.add(i+1);
		}
		return vector;
	}
	
	public static int FitnessFunction(ArrayList<Integer> vector, int[][] MDG)
	{
		int EVM = 0;
		int c1,c2;
		int n = MDG.length;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				c1 = vector.get(i);
				c2 = vector.get(j);
				if(c1==c2) {
					EVM = EVM +2*MDG[i][j]-1;
				}
			}
		}
		return EVM;
	}
	
	public static ArrayList<Integer> SmallChangeOperator(ArrayList<Integer> vector)
	{
		int n = vector.size();
		int randVal = CS2004.UI(0, n-1); //chooses random number from 0 to n-1, to choose which element changes value
		int newVal = CS2004.UI(1, n); //chooses random number from 1 to n, to choose which element changes value
		while(newVal==vector.get(randVal)) {
			newVal = CS2004.UI(1, n);
		}
		vector.set(randVal, newVal);
		return vector;
	}
	
	public static ArrayList<Integer> MunchCluster(int iter, int[][] MDG)
	{
		ArrayList<Integer> C = StartingPoint(MDG);
		ArrayList<Integer> temp;
		int Fx = FitnessFunction(C, MDG);
		int Fy;
		for(int i=0;i<iter;i++) {
			temp = C; 
			C = SmallChangeOperator(C);
			Fy = FitnessFunction(C, MDG);
			if (Fy > Fx) {
				Fx = Fy;
			}
			else {
				C = temp;
			}
		}
		return C;
	}
	
	public static ArrayList<Integer> predictAnswer(ArrayList<Integer> stockData, ArrayList<Integer> queries){ 
	ArrayList<Integer> ansArray = new ArrayList<Integer>();
    for(int i=0;i<queries.size();++i) {
        int loop = 1;
        int currentQuery=queries.get(i);
        //while loop continues til both sides of query are outside of day 1 and the final day, OR if a lower value is found
        while(currentQuery-loop>0 || currentQuery+loop<=stockData.size()) {
            if(currentQuery-loop>0 && stockData.get(currentQuery-1)>stockData.get(currentQuery-1-loop)) {
            	ansArray.add(currentQuery-loop);
                break;
            }
            if(currentQuery+loop<=stockData.size() && stockData.get(currentQuery-1)>stockData.get(currentQuery-1+loop)) {
            	ansArray.add(currentQuery+loop);
                break;
            }
            loop++;
        }
        if(ansArray.size()==i) {
            ansArray.add(-1);
        }
    }
    return ansArray;
	}
}

