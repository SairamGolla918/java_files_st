import java.util.Scanner;

public class HalfPyramid
 {
    public static void main(String[] args) 

    {   
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();

        for(int i = 1 ; i <= num ; i ++)
        {
            for(int j = num - 1 ;j >= i ; j--)
            {
                System.out.print("  ");
            }
            for(int k = 1 ; k <= i; k++ )
            {
                System.out.print("* ");
            }
            System.out.println();

        }

        sc.close();
        
    }
}
