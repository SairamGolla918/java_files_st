package StringPros;
import java.util.*;
public class StringToken
{
	public static void main(String[] args)
	{
		String str = "Constructs a string tokenizer for the a specified a string.";
		StringTokenizer s1 = new StringTokenizer(str," ");
		
		int count = 0;
		String s = " ";
		while(s1.hasMoreTokens())
		{
			System.out.println(s1.nextToken());
		}	
	}
}
