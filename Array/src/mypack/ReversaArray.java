package mypack;

import java.util.Arrays;
import java.util.Iterator;

public class ReversaArray {
	
	void Reverse(int a[])
	{
		int size = a.length;
		for (int i = 0 ; i < size/2 ; i++) 
		{
			int temp = a[i];
			a[i] = a[size-i-1];
			a[size-i-1] = temp;
			
		}
		for (int i : a) 
		{
			System.out.print(i + " ");
		}
		
		
	}
	public static void main(String[] args)
	{
		int a[] = {1,2,3,4,5};
		ReversaArray obj = new ReversaArray();
		obj.Reverse(a);
	}

}
