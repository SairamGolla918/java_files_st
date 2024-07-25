package mypack;

import java.util.Iterator;
import java.util.Scanner;

public class MatrixAddition
{
	static void AddMatrix(int arr1[][],int arr2[][])
	{
		
		for (int i = 0; i < arr1.length; i++) 
		{
			for (int j = 0; j < arr1[i].length; j++) 
			{
				arr2[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		System.out.println("Matrix Addition");
		for (int[] i : arr2) 
		{
			for ( int j : i) 
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of Rows : ");
		int n = sc.nextInt();
		int arr1[][] = new int[n][];
		int arr2[][] = new int[n][];
		for (int i = 0; i < n; i++) 
		{
			System.out.println("Enter the column "+i+" of array 1");
			arr1[i] =new int[sc.nextInt()];
			System.out.println("Enter the column "+i+" of array 2");
			arr2[i] =new int[sc.nextInt()];	
		}
		
		for (int i = 0; i < arr1.length; i++) 
		{
			System.out.println("Enter the elements in the "+ i + " row "+"array 1 ");
			for (int j = 0; j < arr1[i].length; j++)
			{
				arr1[i][j] = sc.nextInt();		
			}
			
		}
		for (int i = 0; i < arr1.length; i++) 
		{
			System.out.println("Enter the elements in the "+ i + " row "+"array 2 ");
			for (int j = 0; j < arr1[i].length; j++)
			{	
				arr2[i][j] = sc.nextInt();		
			}
		}
		System.out.println("Array 1");
		for (int[] i : arr1) 
		{
			for (int j : i) 
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("Array 2");
		for (int[] i : arr2) 
		{
			for (int j : i) 
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		AddMatrix( arr1, arr2);

	}

}
