package AbstractPack;

public abstract class Animal 
{
	int NoofLegs;
	String AnimalType;
	public Animal(int noofLegs, String animalType) {
		NoofLegs = noofLegs;
		AnimalType = animalType;
	}
	public void Walk(int NoofLegs)
	{
		if(NoofLegs >= 2)
			System.out.println("Can Walk");
		else
			System.out.println("Can't Walk");
	}
	abstract 
	
	
}
