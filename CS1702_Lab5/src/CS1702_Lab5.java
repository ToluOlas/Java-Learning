import java.util.ArrayList;

public class CS1702_Lab5 {
	public static void main(String args[])
	{
	ArrayList<Data> array_list = new ArrayList<Data>();
	Data user1 = new Data("Fred",21);
	Data user2 = new Data("Jo", 43);
	Data user3 = new Data("Zoe",37);
	Data user4 = new Data("Harry",78);
	array_list.add(user1);
	array_list.add(user2);
	array_list.add(user3);
	array_list.add(2,user4);
	PrintDataArray(array_list);
	}
	
	private static void PrintDataArray(ArrayList<Data> array)
	{
		for(int i=0;i<array.size();++i)
		{
			array.get(i).Print();
		}
	}

}
