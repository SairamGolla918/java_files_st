package SecondPro;

public class MyBook 
{

	public void setTitle(String str)
	{
		System.out.println("The title is: "+str);
	}

	public static void main(String[] args)
	{	
		MyBook b1 = new MyBook();
		b1.setTitle("A tale of two cities");

	}

} 
