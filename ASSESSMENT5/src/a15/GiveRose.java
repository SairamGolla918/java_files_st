
//3. Anonymous Inner Class Implementing Interface: Define an interface Greeting
//with a method sayHello(). Create an anonymous class implementing Greeting
//inside a method greet() of a class Greeter. The anonymous class should print 
//"Hello, World!" when sayHello() is called.

package a15;



interface Greeting
{
	void sayHello();
	interface Sendoff
	{
		void sayBye();
	}
	
}


class Greeter implements Greeting,Greeting.Sendoff
{
	Greeter()
	{
		System.out.println("Greeter");
	}
	
	public void sayHello()
	{
		
	}
	public void sayBye()
	{
		
	}
	void greet()
	{
		Greeting obj = new Greeting() 
		{	
		public void sayHello() 
		{
			System.out.println("Hello World !");
		}
		};
		obj.sayHello();
	}
	class GiveHug
	{
		GiveHug()
		{
			System.out.println("Give Hug");
		}
		void Friends()
		{
			System.out.println("Friendly Hug");
		}
	}
	
	public static void main(String[] args)
	{
		
		Greeting obj1 = new Greeter();
		obj1.sayHello();
	}
	
}

//class GiveRose extends Greeter.GiveHug
//{
//	GiveRose()
//	{
//		
//	}
//	
//	public static void main(String[] args)
//	{
//		Greeter obj1 = new Greeter();
//		Greeter.GiveHug obj = obj1.new GiveHug();
//		obj.Friends();
//	}
//	
//}




