import java.util.Scanner;

class KrishnaMurthyNum 
{
    public static void main(String[] args) 

   {    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int num = sc.nextInt();
         int rem = 0 , sum = 0 ,temp = num;
         while (num >=1 )
        {
            rem = num % 10;
            num = num /10;
            int fact = 1;
            for(int i = rem; i >= 1 ; i--)
            {
                fact = fact * i;
            }
            sum = sum + fact;

        } 
        if(sum == temp)
        {
            System.out.println("Its Krishna Murthy Num");
        }
        else{
            System.out.print("Its not Krishna Murthy Num");
        }
        sc.close();
    }
    
}
