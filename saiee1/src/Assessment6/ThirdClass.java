package Assessment6;

class MethodORandOL {

	public void MethodOL() 
	{
		System.out.println("MethodOL");
	}
	int MethodOL(int i,int j)
	{
		return i + j;
	}
}

class MethodOR extends MethodORandOL
{	
	
	
	int MethodOL(int i,int j)
	{
		System.out.println(super.MethodOL(2,2));
		return i*j;
	}
	
	
}
public class ThirdClass extends MethodORandOL
{
	int MethodOL(int i)
	{
		System.out.println(super.MethodOL(1,2));
		System.out.println("Third Class");
		return 1+i;
	}
	public static void main(String[] args)
	{
		ThirdClass T1 = new ThirdClass();
		System.out.println(T1.MethodOL(1));
	}
}
