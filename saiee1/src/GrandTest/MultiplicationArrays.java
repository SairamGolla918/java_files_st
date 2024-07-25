package GrandTest;

public class MultiplicationArrays {

	public static void main(String[] args)
	{
		int Arr1[] = {6,2,4};
		int Arr2[] = {3,1};
		
		String num1 ="";
		for (int i = 0; i < Arr1.length; i++) 
		{
			num1 = num1+ Arr1[i];
		}
		String num2 = "";
		for (int i = 0; i < Arr2.length; i++) 
		{
			num2 = num2+Arr2[i];
		}

		int numOne = Integer.parseInt(num1);
		int numTwo = Integer.parseInt(num2);
		
		System.out.println(numOne*numTwo);
	}

}
