package ourpack;

import mypack.FisrtFunInterface;



public interface SecondFunInterface extends FisrtFunInterface
{
	
	void funshow(int i , int j);
	default void display() 
	{
		
		System.out.println("First Functional display");
	}
	static void show() 
	{
		System.out.println("First Functional Show");
		secure();
		
	}
	private static void secure()
	{
		System.out.println("Fi Fun Secure");
	}
}
