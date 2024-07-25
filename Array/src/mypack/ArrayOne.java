package mypack;

import java.util.Scanner;

public class ArrayOne 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the length of array :");
		int n = sc.nextInt();
		
		int a[] = new int[n];
		for(int i = 0;i < n;i++)
		{
			System.out.println("Enter the " + i +" Element");
			a[i] = sc.nextInt();
			
		}
		int sum =0;
//		System.out.println("Array");
//		for(int i = 0;i < n;i++)
//		{
//			sum = sum + a[i];
//			System.out.print(a[i] + " ");
//		}
//		System.out.println();
//		System.out.println("Sum of an Array : "+sum);
//		//System.out.println();
//		for(int i = 0;i < n;i++)
//		{
//			
//			i=i+1;
//			System.out.print("Elements at EvenPosition " +i+"is :"+a[i] + " ");
//		}
		for(int i:a)
		{
			sum = sum + i;
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Sum of an Array : "+sum);
		int b[] = a.clone();
		for(int j:b)
		{
			System.out.print(j+" ");
		}
		System.out.println();
		System.out.println("Is equal : " + (a == b) );
	}

}
