import java.util.Scanner;

class AlphabetPattern {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Scanner se = new Scanner(System.in);
        System.out.print("Enter Starting ASCII value Of Alphabet :");
        int num1 = sc.nextInt();
        System.out.print("Enter Ending ASCII value Of Alphabet :");
        int num2 = se.nextInt();

        for(int i = num1;i <= num2;i++)
        {
            for(int j=65;j<=i;j++)
            {
                System.out.print((char)j + " ");
            }
        System.out.println();
        }
        sc.close();
        se.close();
    }
    
}
