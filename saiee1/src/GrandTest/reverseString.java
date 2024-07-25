package GrandTest;

public class reverseString 
{
	public static void main(String[] args) 
	{
		String str = "This Is Java Class";
		
		String Arr[] = str.split(" ");
		
		String res ="";
		
		for (int i = 0; i < Arr.length; i++) 
		{
			String temp = "";
			for(int j = 0;j < Arr[i].length();j++)
			{
				temp = Arr[i].charAt(j)+temp;
			}
			res = res + temp+" ";
		}
		System.out.println(res);
	}
}
