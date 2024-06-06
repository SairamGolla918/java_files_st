package mypack;


@FunctionalInterface

public interface FisrtFunInterface 
{
	void funshow(int i , int j);
	default void display() 
	{
		System.out.println("First Functional display");
	}
}
