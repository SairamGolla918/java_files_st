package yourPack;

import myPack.*;

public interface SecondInterface extends FirstInterface
{	
	int i = 22;
	void show();
	default void demo() 
	{
		System.out.println("Sdemo");
	}
	default void display()
	{
		System.out.println("Sdisplay");
	}
	default void Second()
	{
		System.out.println("Second");
	}
	
	
}
