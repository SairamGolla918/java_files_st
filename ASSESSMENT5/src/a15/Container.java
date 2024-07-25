package a15;

public class Container 
{
	static class StaticNested
	{
		void display()
		{
			System.out.println( "Inside Static Nested Class");
		}
	}
	
	public static void main(String[] args)
	{
		StaticNested obj = new StaticNested();
		obj.display();
	}
}
