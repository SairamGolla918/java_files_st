package GrandTest;

class Test
{

	void sprint()
	{
		System.out.println("Test sprint");
	}

}
public class MethodOLandOR extends Test
{
	MethodOLandOR()
	{
		
	}
	void go(String a)
	{
		System.out.println("go "+a);
	}
	void go(String a,int b)
	{
		System.out.println("go "+a+" "+b+"nd time too");
	}
	
	void sprint()
	{
		System.out.println("MethodOLandOR sprint");
	
	}
	
	public static void main(String[] args)
	{ 
		Test t1 = new Test();
		Test t = new MethodOLandOR();
		MethodOLandOR obj =new MethodOLandOR();
		t1.sprint();
		t.sprint();
		obj.go("Saiee");
		obj.go("Babe",2);
	}
}
