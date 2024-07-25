package StringPros;

import java.util.Arrays;

public class DuplicateWord 
{
	void duplicate(String s)
	{
		String StrArr[] = s.split(" ");
		boolean array2[] = new boolean[StrArr.length];
		int intArray[] = new int[StrArr.length];
		int index=0;
		int Large = intArray[0];
		for (int i = 0; i < StrArr.length; i++)
		{
			int count = 1;
			
			if (array2[i])
			{
				continue;
			}
			for (int j = i+1; j < StrArr.length; j++) 
			{
				if(StrArr[i].equals(StrArr[j]))
				{
					array2[j] = true;
					count++;
					
				}	
			}
			intArray[i] = count;
			
			if(Large < intArray[i])
			{
				Large = intArray[i];
				index = i;
			}			
		}
		if(Large == intArray[index])
		{
			System.out.println("Most Repeated word : "+StrArr[index]);
		}
		
	}
	public static void main(String[] a)
	{
		String s = "mom and dad are there wish them hi are hi  mom and dad dad mom dad dad";
		DuplicateWord obj = new DuplicateWord();
		obj.duplicate(s);
	}
}
