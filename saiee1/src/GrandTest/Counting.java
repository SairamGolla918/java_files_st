package GrandTest;


import java.util.LinkedHashSet;
import java.util.Set;

public class Counting 
{
	public static void main(String[] args) 
	{
		String str = "Java is is programming language";
		
		String Arr[] =str.split(" ");
		
		Set<String> set =new LinkedHashSet();
		
		for (int i = 0; i < Arr.length; i++) 
		{
			int count = 0;
			for (int j = 0; j < Arr.length; j++) 
			{
				if(Arr[i].equals(Arr[j]))
				{
					count++;
				}
			}
			String s = Arr[i] +" = "+count;
			set.add(s);
		}
		System.out.println(set);
	}
}
