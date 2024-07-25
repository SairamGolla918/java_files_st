package a15;

public class MathOperations 
{
	void performOperation(int a, int b)
	{
		
		class Addition 
		{
			 int add(int a,int b)
			 {
				 return a+b;
			 }
		}
		Addition obj = new Addition();
		System.out.println("sum : " + obj.add(a, b));
	}
	
	public static void main(String[] args) {
		
		MathOperations obj = new MathOperations();
		obj.performOperation(1, 2);

	}

}
