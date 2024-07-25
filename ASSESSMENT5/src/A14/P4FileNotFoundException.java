package A14;

import java.io.*;

public class P4FileNotFoundException 
{
	static void FileNFE(int s) throws  IOException
	{
		if(s >= 1)
			System.out.println("File found");
		else
		{
			throw new FileNotFoundException("File Not Found Exception");
		}
			
	}

	public static void main(String[] args) 
	{
		try
		{
			FileNFE(0);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Iam Back");

	}

}
