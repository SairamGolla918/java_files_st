package saiee2;

public class Calculator 
{
	
	int add(int i,int j)
	{
		int sum = i + j;
		return sum;
	}
	
	double add(double i , double j)
	{
		double sum = i + j;
		return sum;
	}
	
	public static void main(String[] args)
	{
		Calculator num1 = new Calculator();
		System.out.println(num1.add(1, 2));
		System.out.println(num1.add(3.0, 4.0));
	}
	

}
