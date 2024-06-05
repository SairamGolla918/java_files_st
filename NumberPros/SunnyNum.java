import java.util.Scanner;

class SunnyNum
{

    public static void main(String[] args) 

    {   
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number");
        int num = sc.nextInt();
        int temp = 0;
        int c = 0;
        for(int i = 1 ; i<=num ; i++ )
        {
            temp = (i*i) - 1;
            if(temp == num)
            {
                c = 1;
                break;
            }
        }
        if(c == 1)
            System.out.println("Its Sunny Num " + num);
        else
            System.out.println("Its not Sunny Num " + num);
        sc.close();
    }
    
}
