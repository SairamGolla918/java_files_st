package myPack;

public interface FirstInterface 
{
	int i = 69;//public static final
	void show();// public abstract
	void display();
	default void demo()
	{
		System.out.println("FDemo");
	}
	
}
