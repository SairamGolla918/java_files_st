import java.util.Scanner;

public class MinMaxDigit {
    public static void main(String[] args)
     {  
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 5 digit Number :");
        int n = sc.nextInt();
        int max = 0 , min = 9 , rem = 0; 
        while(n>0)
        {
            rem = n % 10;
            
            if(rem > max)
                max = rem;
            else if(rem < min)
                min = rem;
            n = n / 10;
        }
        System.out.println("Max " + max);
        System.out.println("Min " + min);

        sc.close();
    }
}
