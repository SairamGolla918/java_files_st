import java.util.Scanner;

class Factorial {

    public static void main(String[] args) 
    {   
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        int num1 = num , fact = 1;
        for(int i = num1; i >= 1; i--)
        {
            fact = fact * i;
        }
        System.out.println(fact);  
        sc.close(); 
    }
 
}
