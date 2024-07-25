package A14;

public class P5NullPointerException 
{
	
	void NullPE(String s)
	{
		
			String k = s;
	}

	public static void main(String[] args) 
	{
		try
		{
		String str = null;
		String s = new String(str);
		P5NullPointerException obj = new P5NullPointerException();
			obj.NullPE(s);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Iam Back");

	}

}
