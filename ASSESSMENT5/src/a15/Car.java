package a15;

public class Car
{
	String model;
	Car(String model)
	{
		this.model = model;
	}
	class Engine
	{
		String Start()
		{
			return "Car model : "+model;
		}
	}
	public static void main(String[] args) 
	{
		Car car = new Car("Thar");
		Car.Engine model = car.new Engine();
		System.out.println(model.Start());
	}
}
