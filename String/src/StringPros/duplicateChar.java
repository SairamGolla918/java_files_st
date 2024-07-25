package StringPros;

public class duplicateChar 
{
	
	void duplicate(String s)
	{
		boolean array2[] = new boolean[s.length()];
		System.out.print("Duplicate chars : ");
		for (int i = 0; i < s.length(); i++)
		{
			int count = 1;
			if (array2[i])
			{
				continue;
			}
			for (int j = i+1; j < s.length(); j++) 
			{
				if(s.charAt(i)==s.charAt(j))
				{
					array2[j] = true;
					count++;
				}	
			}
			if(count>1)
			{
				System.out.print(s.charAt(i)+" ");	
			}
		}	
	}

	public static void main(String[] args)
	{
		String str = "saieeeee";
		duplicateChar obj = new duplicateChar();
		obj.duplicate(str);
	}
}
