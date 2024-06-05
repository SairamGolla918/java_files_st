import java.util.Scanner;

class CollatzSeries
{
    public static void main(String[] args)
    {   
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number :");

        int num = sc.nextInt();

        while(num != 1)

        {   
            System.out.print(num + " ");
            if(num % 2 == 0)
                num = num /2;
            else if(num % 2 == 1)
                num = 3 * num + 1;
        }
        sc.close();
        
    }
}