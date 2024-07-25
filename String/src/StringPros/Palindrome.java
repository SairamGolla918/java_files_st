package StringPros;

public class Palindrome //Java String Program to Insert a string into another string

{
	void CheckPali(String s)
	{
		String str = "";
		for(int i = s.length()-1;i >= 0;i--)
		{
			str = str + s.charAt(i);
		}
		if(s.equals(str))
			System.out.println("Its Pali");
		else
			System.out.println("Its not Pali");
	}
	public static void main(String[] args)
	{
		String str = "madam";
		Palindrome obj = new Palindrome();
		obj.CheckPali(str);
	}
}
