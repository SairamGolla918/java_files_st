// 10) Write a program that prints the numbers from 1 to 100. But for multiples of three, 
// print “Fizz” instead of the number, and for the multiples of five, print “Buzz”. For 
// numbers that are multiples of both three and five, print “FizzBuzz”.


package GrandTest2;

public class FizzBuzz 
{
    public static void main(String[] args) 
    {
        int n = 100;
        for (int i = 1; i <= n; i++) 
        {
            if(i%3==0 && i%5 == 0)
                System.out.println("FizzBuzz");
            else if(i%3==0)
                System.out.println("Fizz");
            else if(i%5==0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }
}
