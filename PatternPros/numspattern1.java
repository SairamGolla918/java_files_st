import java.util.Scanner;

public class numspattern1 {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        for(int i = 1;i <= num;i++)
        {
            int count = 1;
            for(int j = 1 ; j <= i; j++ )
            {
                System.out.print(count++ + " ");
            }
            System.out.println();

        }   
        sc.close();
    }
    
}
