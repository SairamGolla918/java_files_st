package ourpack;

import myPack.Vehicle;

public interface FourWheeler extends Vehicle
{
	int i = 4;
	default void noOftyres(int i)
	{
		System.out.println("Its " + i + "wheleer");
	}
	default void accelrate(int speed)
	{
		Vehicle.start(true);
		System.out.println("Speed " + speed );
	}
	default void brake(int speed)
	{
		Vehicle.stop(true);
		System.out.println("Speed" + speed);
	}
}
