package myPack;

public interface InterfaceCreditCard 
{
	void pay(double amount);
	default void repay(double amount)
	{
		System.out.println("Amount repay" + amount);
	}
}
