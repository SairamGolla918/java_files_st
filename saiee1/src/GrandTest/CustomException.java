package GrandTest;

public class CustomException extends Exception
{
	String message;
	Exception SaieeException;
	CustomException(String message)
	{
		this.message=message;
		
	}
	
	void temp()throws Exception
	{
		System.out.println("saiee");
		throw SaieeException;
		
	}

	public static void main(String[] args) 
	{
		CustomException obj = new CustomException("saiee");
		try
		{
			obj.temp();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Exception thrown");
		}
		
		
	}

}
