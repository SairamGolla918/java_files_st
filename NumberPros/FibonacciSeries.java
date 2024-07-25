import java.util.Scanner;

public class FibonacciSeries
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number");
        //int n = sc.nextInt();
        int  n1 = 0,n2 = 1,n3 = 0,count = 0;  
        
        while(n2>=0)
        {
            
            n3 = n1 + n2;
            System.out.print(n1 + " ");
            n1 = n2;
            n2 = n3;
            count++;  
        }   
        System.out.println();
        System.out.println("Total count : "+count);
        sc.close();
    }   
}
