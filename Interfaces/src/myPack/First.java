package myPack;

public interface First 
{
	void show();
	default void display()
	{
		System.out.println("First Interface");
	}
}
