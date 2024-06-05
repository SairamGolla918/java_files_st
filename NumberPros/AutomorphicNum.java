
// 76 * 76 = 5776 -- 76 == 76


import java.util.Scanner;
class AutomorphicNum 
{
    public static void main(String[] args)  
    {   
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int num = sc.nextInt();
        int temp = num * num;
        int rem = temp % 100;
        if(num == rem)
            System.out.println("Its Automorphic Num");
        else
            System.out.println("Its not Automorphic Num");
        
        sc.close();

    }
}
