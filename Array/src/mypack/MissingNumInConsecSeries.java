package mypack;

public class MissingNumInConsecSeries 
{
	void MissingNum(int a[])
	{
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]+1 != a[i+1])
			{
				System.out.println( "Missing Num : "+(a[i]+1));
				break;
			}
		}
	}
	public static void main(String[] args)
	{
		int arr[] = {1,2,3,5,6};
		MissingNumInConsecSeries obj = new MissingNumInConsecSeries();
		obj.MissingNum(arr);
	}
}
