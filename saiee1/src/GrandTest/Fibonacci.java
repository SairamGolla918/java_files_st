package GrandTest;

public class Fibonacci {
	
	static int n1 = 0,n2 = 1,n3 = 0,n =4;
	static void Fib(int c)
	{
		
		if(c > 0 ) 
		{
			if(c == n-1)
				System.out.println("Nth-element is: "+n1);
			n3 = n1+n2;
			n1 = n2;
			n2 = n3;
			Fib(c-1);
		}
		
	}

	public static void main(String[] args) 
	{
		Fib(6);	
	
	}

}
