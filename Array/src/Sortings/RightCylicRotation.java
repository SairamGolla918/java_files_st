package Sortings;

public class RightCylicRotation 

{
	int[] BSort(int a[])
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
		return a;
	}
	void RotationCount(int array[])
	{
		int a[] = BSort(array);
		int b[] = array;
		int count = 0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++) 
			{
				int temp = a[1];
				a[1] =a[a.length-2];
				a[a.length-2] = temp;
				int temp2 = a[0];
				a[0] =a[a.length-1];
				a[a.length-1] = temp2;	
			}
			for (int k : a)
			{
				for (int l : b) 
				{
					if(k==l)
						count++;
				}
			}
		}
		System.out.println(count);
	}
	public static void main(String[] a)
	{
		int arr[] = {15,18,2,3,6,12};
		
		RightCylicRotation obj = new RightCylicRotation();
		obj.RotationCount(arr);
		
	}
}
