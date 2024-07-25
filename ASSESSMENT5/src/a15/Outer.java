
package a15;


class Outer
{
	void display()
	{
		System.out.println("Display");
	}
	class Inner
	{
		void show()
		{
			System.out.println("Hello from Inner Class");
		}
	}
	public static void main(String[] args) 
	{
		Inner obj = new Outer().new Inner();
		Outer obj2 = new Outer();
		Outer.Inner obj1 = obj2.new Inner();
		obj1.show();
		obj2.display();

	}
	
}
