package mypack;

import java.util.Arrays;
import java.util.Scanner;

public class JaggedArrayOne 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of row array");
		int n = sc.nextInt();
		int c[][] =new int[n][];
		System.out.println("Enter the columns:");
		for (int i = 0; i < c.length; i++)
		{
			c[i]=new int[sc.nextInt()];
		}
		for(int i = 0;i<c.length;i++)
		{
			System.out.println("Enter the elements array");
			for(int j= 0;j<c[i].length;j++)		
			{	
				c[i][j]=sc.nextInt();
			}
		}
		System.out.println("Jagged Array");
		for(int[] i:c) 
		{
			for(int j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
