package a15;

public class Device 
{
	interface Battery
	{
		void charge();
	}
	
	class Phone implements Battery
	{
		public void charge()
		{
			System.out.println("Phone is charging");
		}
	}
	
	public static void main(String[] args)
	{
		Device device = new Device();
		Device.Phone phone = device.new Phone();
		phone.charge();	
	}
}




















//5. Inner Interface: Create a class Device with an inner interface Battery. The 
//Battery interface should have a method charge(). Implement this interface in a 
//class Phone and provide the implementation of the charge() method that prints 
//"Phone is charging".