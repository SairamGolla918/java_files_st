package ourpack;

import myPack.FirstInterface;
import yourPack.SecondInterface;

public class ClassOne implements FirstInterface, SecondInterface 
{
	public void show() 
	{
		SecondInterface.super.demo();
		System.out.println("Supershow " + SecondInterface.i);
	}
	public void demo() 
	{
		int i = 2;
		i = FirstInterface.i + SecondInterface.i;
		SecondInterface.super.demo();
		System.out.println("Superdemo "+i);
		display();
		SecondInterface.super.Second();
	}
	public void display() 
	{
		SecondInterface.super.display();
		System.out.println("display");
	}
	
	public static void main(String[] args)
	{
		FirstInterface  obj = new ClassOne();
		obj.show();
		SecondInterface  obj1 = new ClassOne();
		obj1.demo();
		
	}
}
