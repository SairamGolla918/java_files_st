package lastpack;

import myPack.First;
import ourpack.Second;
import yourPack.FirstClass;

public class SecondClass extends FirstClass implements First, Second 
{

	public void display()
	{
		super.show();
		First.super.display();
		Second.super.display();
		System.out.println("Super Show");
	}
	
	public static void main(String[] args) 
	{
		Second obj = new SecondClass();
		obj.display();

	}

}
