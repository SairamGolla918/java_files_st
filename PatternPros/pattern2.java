
/*
 * * * * *
 * * * * 
 * * *
 * *
 * 
 */

import java.util.Scanner;

public class pattern2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number");
        int num = sc.nextInt();
        for(int i = num; i >= 1 ;i--)
        {
            for(int j = i ; j >= 1;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();

    }
    
}
