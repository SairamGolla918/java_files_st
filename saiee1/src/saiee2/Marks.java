package saiee2;
import java.util.Scanner;

public class Marks 
{
	
	
	void calculateGrade(int Mrks)
	{
		if (Mrks >= 90)
			System.out.println("A");
		else if (Mrks >= 80 && Mrks < 90)
			System.out.println("B");
		else if (Mrks >= 70 && Mrks < 80)
			System.out.println("C");
		else if (Mrks >= 60 && Mrks < 70)
			System.out.println("D");
		else
			System.out.println("F");
	}
	
	public static void main(String[] a)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Marks : ");
		int Mrks = scan.nextInt();
		Marks s1 = new Marks();
		s1.calculateGrade(90);
	}
}
