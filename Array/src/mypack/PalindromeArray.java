package mypack;

public class PalindromeArray 
{
		void Palindrome(int a[])
		{
		
			boolean isPalindrome =false;
			int size = a.length;
			for (int i = 0; i <size/2; i++) 
			{
				if(a[i] == a[size - 1 - i])
				{
					isPalindrome = true;
				}
				else
					isPalindrome = false;
			}
			if(isPalindrome)
				System.out.println("Palindrome Array");
			else
				System.out.println("Not Palindrome Array");
		}
		public static void main(String[] arg)
		{
			int a[] = {1,4,1};
			PalindromeArray obj = new PalindromeArray();
			obj.Palindrome(a);
		}
}
