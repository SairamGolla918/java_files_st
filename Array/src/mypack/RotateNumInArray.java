package mypack;

import java.util.Arrays;

public class RotateNumInArray 
{
	void rotateNum(int a[],int num)
	{
		
		for (int i = 0; i < num; i++) 
		{
			int d = a[i];
			int temp = a[i+1];
			a[i+1] = d;
			a[i] = temp;
		}
		System.out.println(Arrays.toString(a));
	}
	public static void main(String[] args)
	{
		int num = 2;
		int a[] = {1,2,3,4,5};
		RotateNumInArray obj = new RotateNumInArray();
		obj.rotateNum(a, num);
	}
}
