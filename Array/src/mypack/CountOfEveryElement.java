package mypack;

public class CountOfEveryElement 
{

	public static void main(String[] args)
	{
		char array1[] = {'s','a','i','e','e','s','a','i','e'};
		boolean array2[] = new boolean[array1.length];
		
		for(int i = 0;i < array1.length ; i++ )
		//for(int i:array1)
		{
			int count = 1;
			if (array2[i])
			{
				continue;
			}
			
			for(int j = i+1;j < array1.length ; j++ )
				//for(int j:array1)
				{
					if( array1[i] ==  array1[j])
					{
						array2[j] = true;
						count++;
					}
					
				}
			
				System.out.println("count of " +array1[i] + ": "+count);
			
			
		}
	}
}
