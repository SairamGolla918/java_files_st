package GrandTest;

interface Printable
{
	public void print();
}
public class LambdaExpression 
{
	public static void main(String[] args)
	{
		Printable p1 = ()->{
			System.out.println("Saiee");
		};
		
		p1.print();
	}
}
