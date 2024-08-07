package myPack;
import java.util.Scanner;

class creditCard implements Payment 
{
	
	int cardNumber;
	int expirationDate;
	int CVV;

	
	creditCard(int cardNumber,int expirationDate,int CVV) 
	{
		this.cardNumber = cardNumber;
		this.expirationDate = expirationDate;
		this.CVV = CVV;
		
	}
	public void processPayment(double amount)
	{
		System.out.println("credit card processing, Payment done of amount: "+amount);
	}

}

class debitCard implements Payment
{
	int cardNumber;
	int expirationDate;
	int CVV;
	
	debitCard(int cardNumber,int expirationDate,int CVV)
	{	
		this.cardNumber = cardNumber;
		this.expirationDate = expirationDate;
		this.CVV = CVV;
		
	}
	public void processPayment(double amount)
	{
		System.out.println("Payment successfull through Debit Card of amount: "+amount);
	}
}

class cashOnDelivery implements Payment
{
	double amount;
	
	cashOnDelivery(double amount) {
		this.amount = amount;
	}
	public void processPayment(double amount)
	{
		System.out.println("cash on delivery process, successfully paid: "+amount);
	}
}

class paymentProcessor
{
	void makePayment(Payment payment,double amount)
	{
		payment.processPayment(amount);
	}
	void makePayment(int cardNumber,int expirationDate,int CVV,double amount)
	{
		Payment dbCard = new debitCard(cardNumber,expirationDate,CVV);
		Payment cdCard = new creditCard(cardNumber,expirationDate,CVV);
		Payment cod = new cashOnDelivery(amount);
		makePayment(cdCard, amount);
		makePayment(dbCard, amount);
		makePayment(cod,amount);
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double amount;
		System.out.print("Enter the amount to pay: ");
		amount = input.nextDouble();
		
		paymentProcessor paymentObj = new paymentProcessor();
		paymentObj.makePayment(123, 23, 567, amount);
		
		debitCard dbCard = new debitCard(7666,2554,661);
		cashOnDelivery cod = new cashOnDelivery(661.00);
	}
}

class ATM

{
	int card;
	int id;
	
}

