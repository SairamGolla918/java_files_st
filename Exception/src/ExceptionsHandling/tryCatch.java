package ExceptionsHandling;

public class tryCatch 
{	
	
	
	public static void main(String[] args) 
	{
		try
		{
			String s = "Saiee";
			System.out.println("Try block");
			int i = s.charAt(6);
			int j = 200/0;
			
		}
		catch(ArithmeticException e)
		{
		System.out.println("Catch block");
		
		}
		catch(IndexOutOfBoundsException p)
		{
			try {
				System.out.println("Try block1");
				int j = 200/0;
				}
			catch(Exception d)
			{
				System.out.println("Catch block2");	
			}
		}
		finally
		{
			System.out.println("final block");
		}
		System.out.println("Back to Main");	
	}

}
