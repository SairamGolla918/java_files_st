package Assessment8;

public class AnimalOut {

	public static void main(String[] args) 
	{
		
		Dog d = new Dog();
		System.out.println(d.Speak());
	}

}

class Dog implements Animal
{
	public void Bark() {
		
	}
	public String Speak()
	{
		return "Dog is barking";
	}	
}
