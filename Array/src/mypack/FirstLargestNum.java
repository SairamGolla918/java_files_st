package mypack;

public class FirstLargestNum {

	public static void main(String[] args) 
	{
		int array1[] = {1,2,4,5,6};
		int FirstLargestNum = array1[0];
		
		for(int i = 0;i < array1.length  ;i++ )
		{
			if(FirstLargestNum<array1[i])
			{
				FirstLargestNum = array1[i];
			}
		}
		System.out.println("FirstLargestNum : "+FirstLargestNum);

	}

	
	

}
