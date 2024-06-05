import java.util.Scanner;

class Armstrong 
{
    public static void main(String[] Args)
    {   
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number");
        int num = sc.nextInt();
        int i = num , rem = 0 , n = 0;
        int temp = i;
        while(i>0)
        {
            rem = i % 10;
            i = i /10;
            n = n + rem * rem * rem;

        }
        if(temp ==n)
        System.out.println("Its Armss");
        else
        System.out.println("Its not Armss");
        sc.close();

    }
    
}
