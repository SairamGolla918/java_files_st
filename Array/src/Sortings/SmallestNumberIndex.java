package Sortings;

public class SmallestNumberIndex 
{
	void Index(int a[])
	{
		int index = 0;
		for (int i = 1; i < a.length-1; i++) 
		{
			if(a[i]>a[i+1])
			{
				index = i+1;
			}		
		}
		System.out.println(index);
		
	}
	
	public static void main(String[] a)
	{
		int arr[] = {7,9,11,12,5};
		
		SmallestNumberIndex obj = new SmallestNumberIndex();
		obj.Index(arr);
	}
}
