package Sortings;

import java.util.Scanner;

public class BubbleSort 
{
	
	void BSort(int a[])
	{
		int size = a.length;
		
		for(int  i = 0;i<size-1;i++)
		{
			for(int j = 0;j<size-i-1;j++) 
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		System.out.println("Sorted array");
		for(int k:a)
		{
			System.out.print(k+" ");
		}
		
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements");
		for (int i = 0; i < a.length; i++) 
		{
			a[i] = sc.nextInt();
		}
		BubbleSort obj=new BubbleSort();
		obj.BSort(a);
		
	}
}
