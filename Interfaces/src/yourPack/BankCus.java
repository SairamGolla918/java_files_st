package yourPack;

import myPack.InterfaceCreditCard;
import ourpack.InterfaceDebitCard;

public class BankCus implements InterfaceCreditCard, InterfaceDebitCard 
{
	double amount;
	String CardNum;

	public BankCus() {
		
	}

	
	public BankCus(double amount, String cardNum) 
	{
		super();
		this.amount = amount;
		CardNum = cardNum;
	}


	@Override
	public void pay(double amount) 
	{
		InterfaceDebitCard.super.pay(amount);
		InterfaceCreditCard.super.repay(amount);
		InterfaceDebitCard.cardNum("7666 5555 5555");
		
		
		System.out.println("Credit card emi :" + amount);

	}
	
	private void FixedDeposit(double amount)
	{
		System.out.println("the deposited :" + amount);
	}

	
	@Override
	public String toString() {
		return "BankCus [amount=" + amount + ", CardNum=" + CardNum + "]";
	}


	public static void main(String[] args) 
	{
		BankCus bc1 = new BankCus();
		bc1.pay(200000.0);
		bc1.FixedDeposit(20000000.0);
		
	}

}
