package Sortings;

import java.util.Scanner;

public class SelectionSort 
{
	void SecSort(int a[])
	{
		for (int i = 0; i < a.length; i++) 
		{
			int min = i;
			for (int j = i+1; j < a.length; j++)
			{
				if(a[j]<a[min])
				{
					min = j;
				}
			
			}
			int temp = a[min];
			a[min] = a[i];
			a[i] = temp;
		}
		for (int i : a) 
		{
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		System.out.println("Enter the elements of array");
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) 
		{
			arr[i] = sc.nextInt();
		}
		SelectionSort obj = new SelectionSort();
		obj.SecSort(arr);
		
	}
}
