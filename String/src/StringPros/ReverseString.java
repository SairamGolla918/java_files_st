package StringPros;

public class ReverseString 
{
	void Reverse(String s)
	{
		String rev = "";
		for (int i = 0; i < s.length(); i++) 
		{
			rev = s.charAt(i) + rev;
		}
		System.out.println("Rev String : "+rev);
	}
	
	
	public static void main(String[] args)
	{
		String s = "saiee";
		ReverseString obj = new ReverseString();
		obj.Reverse(s);

	}

}
