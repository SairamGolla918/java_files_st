import java.util.Scanner;

public class FibonacciSeries
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int n = sc.nextInt();
        int  n1 = 0,n2 = 1;  
        
        while(n1<=n)
        {
            System.out.print(n1 + " ");
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;  
        }   
        sc.close();
    }   
}
