

//1. Handling Array Index Out of Bounds
//• Write a program that initializes an array of integers with a fixed size. Access an index 
//that is out of the array bounds and handle the resulting exception with an appropriate 
//error message.

package A14;

public class Problem1ArrayIndexOutOFBound 
{

	public static void main(String[] args) 
	{
		int Arr1[] = {1,2,3,4,5};
		
		try 
		{
			int excep = Arr1[7];
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Out OF Bound");
			e.printStackTrace();}
	}

}
