package mypack;

import java.util.Iterator;
import java.util.Scanner;


public class TwodArray {
	
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
		System.out.println("Enter the rows :");
		int rows = sc.nextInt();
		System.out.println("Enter the columns :");
		int columns = sc.nextInt();
		int twodarr[][] =new int[rows][columns];
		int twodarr1[][] =new int[rows][columns];
		
		for (int i = 0; i < rows; i++)
		{
			System.out.println("Enter the array 1 elements in "+i+" rows :");
			for (int j = 0; j < columns; j++) 
			{
				twodarr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < rows; i++)
		{
			System.out.println("Enter the array 2 elements in "+i+" rows :");
			for (int j = 0; j < columns; j++) 
			{
				twodarr1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Two D Array 1 : ");
		for (int[] i : twodarr) 
		{
			for (int j : i) 
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("Two D Array 2 : ");
		for (int[] i : twodarr1) 
		{
			for (int j : i) 
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		AddMatrix( twodarr, twodarr1);
	}

}
