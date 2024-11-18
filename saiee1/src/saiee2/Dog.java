package saiee2;

public class Dog
{
	void makeSound()
	{
		System.out.println("Woof");
	}
	public static void mains(String[] args)
	{
		Dog d1 = new Dog();
		d1.makeSound();
	}
}
