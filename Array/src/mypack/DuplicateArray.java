package mypack;

import java.util.Arrays;

public class DuplicateArray 
{
	public static void main(String[] args)
	{
		int a[] = {6,7,8,9,10};
		int b[] = a.clone();
		System.out.print("Main Array : ");
		System.out.println(Arrays.toString(a));
		System.out.print("Copied Array : ");
		System.out.println(Arrays.toString(b));
	}
}
