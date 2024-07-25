// * * * * *
//   * * * *
//     * * *
//       * *
//         * 



import java.util.Scanner;

class Pattern5 
{
    public static void main(String[] args)
    {   
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int num = sc.nextInt();
        for(int i = num;i >= 1;i--)
        {
            for(int j = i; j < num ;j++ )
            {
                System.out.print("  ");
            }
            for(int k = i;k >= 1;k--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
