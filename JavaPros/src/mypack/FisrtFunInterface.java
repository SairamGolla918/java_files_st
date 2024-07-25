package mypack;


@FunctionalInterface

public interface FisrtFunInterface 
{
	void funshow(int i , int j);
	default void display() 
	{
		quit();
		System.out.println("First Functional display");
	}
	static void show() 
	{
		System.out.println("First Functional Show");
		secure();
		
	}
	private void quit()
	{
		display();
		System.out.println();
	}
	private static void secure()
	{
		System.out.println("Fi Fun Secure");
	}
}
