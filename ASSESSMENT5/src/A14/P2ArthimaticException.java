
//2. Division by Zero
//• Create a simple calculator program that takes two integers as input and performs 
//division. Handle the ArithmeticException that occurs when the divisor is zero and 
//display an appropriate message

package A14;


public class P2ArthimaticException 
{

	public static void main(String[] args) 
	{
		try 
		{
			int a= 10 ,b = 0,c = a/b ;
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException");
			e.printStackTrace();
			System.out.println("catch block");
		}	
	}
}
