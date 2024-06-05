import java.util.Scanner;

public class Pyramid {

    public static void main(String[] args) {

        {   
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your number: ");
            int num1 = sc.nextInt();
            for(int i = 1 ; i <= num1 ; i++ )
            {
                for(int k = num1; k >=i ;k--)
                {
                    System.out.print(" ");
                }

                for(int j = 1; j <= i;j++)
                {
                    System.out.print("*"+" ");
                }
                System.out.println();
            }
            sc.close();
        }
    }
    
}
