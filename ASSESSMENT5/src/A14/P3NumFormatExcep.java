package A14;

import java.util.Scanner;



public class P3NumFormatExcep 
{
	public static void main(String[] args)
	{
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int a = 0;
		try 
		{
			
			a = Integer.parseInt(str);
			
		}
		catch(NumberFormatException e)
		{
			System.out.println("NumberFormatException");
			e.printStackTrace();
		}
		a+=10;
		System.out.println("Converted String with add of 10 "+ a);
	}
}
