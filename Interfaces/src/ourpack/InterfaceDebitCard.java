package ourpack;

public interface InterfaceDebitCard 
{
	default void pay(double amount)
	{
		System.out.println("Amount to pay"+amount);
	}
	static void cardNum(String Num)
	{
		System.out.println("Card num you paying with" + Num);
	}
	private void FixedDeposit(double amount)
	{
		System.out.println("the deposited :" + amount);
	}
	
}
