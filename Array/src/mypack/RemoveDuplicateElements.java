package mypack;

import java.util.Arrays;

public class RemoveDuplicateElements 
{
	public static void main(String[] args)
	{
		int a[] = {1,2,3,4,5,1,3,4,2,7,6,9,9,10,10,11};
		System.out.println("Array with Duplicates : "+Arrays.toString(a));
		System.out.print("Array without Duplicates : ");
		for (int i = 0; i < a.length; i++) 
		{
			boolean isExist = true;
			for (int j = 0; j < i; j++) 
			{
				if(a[i] == a[j])
				{
					isExist = false;
					break;
				}
			}
			
			if(isExist)
			{
				System.out.print(a[i]+" ");
			}
		}
	}

}
