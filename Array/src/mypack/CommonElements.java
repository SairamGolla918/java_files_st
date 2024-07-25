package mypack;

import java.util.Arrays;

public class CommonElements {

	public static void main(String[] args) 
	{
	
		int array1[] = {1,3,4};
		int array2[] = {3,4,5,6,1,2};
		int commonarray[] =new int[Math.min(array1.length,array2.length)];
		int index=0;	
		/*for(int i= 0 ; i < array1.length ; i++ )//
			
		{
			for(int j= 0;j<array2.length;j++)//
			{
				if((array1[i]) == (array2[j]))//
				{
					//System.out.print(array1[i]+" ");
					//int j = 0;
					commonarray[index++] = array1[i];
				}		
			}
		}		
			
		for (int k:commonarray)
		{
			System.out.print(k+" ");
		}
		System.out.println(commonarray.toString());*/
		
		for(int i:array1)
		{
			for(int j:array2)
			{
				if(i == j)
				{
					commonarray[index++] = i;
				}
					
			}
		}
//		for (int k:commonarray)
//		{
//			System.out.print(k+" ");
//		}
		System.out.println(Arrays.toString(commonarray));

	}

}



