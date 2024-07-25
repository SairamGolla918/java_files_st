package ourpack;



public class FirstFunClass implements SecondFunInterface
{

	static void show()
	{
	SecondFunInterface.show();
	
		System.out.println("class Show");
	}

	public void funshow() 
	{
		System.out.println("over ridden funshow");
		
	}
	public static void main(String[] args) 
	{
		
		FirstFunClass obj1 = new FirstFunClass();
		obj1.funshow(2,5);
		obj1.display();
		obj1.show();
		
	}
	@Override
	public void funshow(int i, int j) {
		// TODO Auto-generated method stub
		
	}

}
