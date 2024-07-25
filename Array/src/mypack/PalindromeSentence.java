package mypack;

public class PalindromeSentence 
{
	void split(String str)
	{
		int len = str.length();
		String arr[]= new String[3];
		String temp ="";
		int count = 0;
		String rev = "";
		for(int i = 0 ; i < len ;i++)
		{
			if(arr[i] == " ")
			{
				arr[count] = temp;
				temp ="";
			}
			else
				temp = temp +arr[i];	
		}
	}
	void Palindrome(String a[])
	{
		String arr[] = new String[3];
		int size = a.length;
		int count = 0;
		for (int i = 0; i <size; i++) 
		{
			boolean isPalindrome =false;
			
			for (int j = 0; j < a[i].length()/2; j++) 
			{
				if(a[j] == a[a[j-1].length() - i -1] )
					isPalindrome = true;
				else
					isPalindrome = false;
			}
			if(isPalindrome)
			{
				arr[count] = a[i];
			}
			
			
		}
		
	}
	
	public static void main(String[] args) 
	{
		

	}

}
