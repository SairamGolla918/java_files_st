package mypack;

import java.util.Scanner;

public class PassingArrayToMethod 
{

	int sum;
	void show(int a[])
	{
		for(int i:a)
		{
			sum = sum + i;
		}
		System.out.println(sum);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Size of row array");
		int n = sc.nextInt();
		System.out.println("Enter the Size of column array");
		int m = sc.nextInt();
		
		int c[][] =new int[n][m];
		
		for(int i = 0;i<n;i++)
		{
			System.out.println("Enter the elements array");
			for(int j = 0;j<m;j++)
			{
				
				c[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the num to check");
		int num = sc.nextInt();
		boolean isFound = false; 
		for(int i = 0;i<n;i++)
		{
			System.out.println();
			
			for(int j = 0;j<m;j++)
			{
				System.out.print(c[i][j]+" ");
				
				if(c[i][j] == num) 
				{
					System.out.println();
					isFound =true;
					System.out.println("index "+i+" "+j);
					break;
				}
				
			}
		}
		if(isFound)
		{
			System.out.println("found");
		}
		else
		{
			System.out.println("Not Found");
		}
//		PassingArrayToMethod obj = new PassingArrayToMethod ();
//		obj.show();
	}
}
