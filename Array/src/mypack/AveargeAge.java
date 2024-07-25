package mypack;

public class AveargeAge 
{
	public static void main(String[] args)
	{
		int AgesArray[] = {21,22,23,22,21,23,21};
		int len = AgesArray.length;
		int sum = 0;
		for(int i:AgesArray)
		{
			sum = sum +i;
		}
		System.out.println("Ages Average : "+sum/len);
	}
	
}
