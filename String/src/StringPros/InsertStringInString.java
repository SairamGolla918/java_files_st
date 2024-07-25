package StringPros;

public class InsertStringInString 
{
	
	void insert(String s1,String s2,int j)
	{
		String[] a1 = s1.split(",");
		
		String[] a2 = new String[a1.length+j];
		
		for (int i = 0; i < a1.length; i++)
		{
			a2[i] = a1[i];
		}
		String temp = a2[j];
		a2[j] = s2;
		a2[j] = temp;
		
		System.out.println(String.join(" ", a2));
	}
	
	void insert1(String s1,String s2,int j)
	{
		String resStr = "";
		for (int i = 0; i < s1.length(); i++) 
		{
			if (i==j)
			{
				for (int k = 0; k < s2.length(); k++) 
				{
					resStr = resStr+s2.charAt(k);
				}
			}
			resStr = resStr+s1.charAt(i);
		}
		System.out.println(resStr);
	}
	public static void main(String[] args) 
	{
		String S1 = "welcome mr";
		String S2 = " Saiee";
		int j = 7;
		InsertStringInString obj = new InsertStringInString();
		obj.insert1(S1, S2,j);
	}

}
