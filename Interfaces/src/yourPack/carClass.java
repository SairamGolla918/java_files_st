package yourPack;

import myPack.Vehicle;
import ourpack.FourWheeler;
import ourpack.Second;

public class carClass implements FourWheeler
{
	String fuel;
	public carClass() 
	{
		
	}
	public void fuelType(String fuel) 
	{
		FourWheeler.super.noOftyres(4);
		FourWheeler.super.accelrate(100);
		
		
		System.out.println("Fuel Type :"  + fuel);
		

	}
	public void noofTyres(int i) 
	{
		System.out.println("no of tyres" + i);
		FourWheeler.super.brake(0);
		
	}
	public static void main(String[] args)
	{
		carClass c = new carClass();
		
		c.fuelType("Petrol");
		c.noofTyres(4);
		
		
	}
	@Override
	public void noofTyres() {
		
	}
	



}
