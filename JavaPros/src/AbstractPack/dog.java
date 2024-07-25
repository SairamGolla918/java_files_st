package AbstractPack;

public class dog extends Animal
{

	public dog(int noofLegs, String animalType) 
	{
		super(noofLegs, animalType);
		
	}

	void fourlegs()
	{
		
		System.out.println("Its 4 leg animal");
	}
	public static void main(String[] args)
	{
		dog d = new dog(4,"Pet");
		d.fourlegs();
		d.Walk(4,"Pet");
	}
}
