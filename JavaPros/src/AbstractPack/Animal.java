package AbstractPack;

public abstract class Animal 
{
	int NoofLegs;
	String AnimalType;
	abstract void fourlegs();
	public Animal(int noofLegs, String animalType) {
		NoofLegs = noofLegs;
		AnimalType = animalType;
	}
	public void Walk(int NoofLegs, String animalType)
	{
		if(NoofLegs >= 2)
			System.out.println(animalType+" "+NoofLegs+" "+"legs animal Can Walk");
		else
			System.out.println(animalType+" "+NoofLegs+" "+"legs animal Can't Walk");
	}
	
	
}
