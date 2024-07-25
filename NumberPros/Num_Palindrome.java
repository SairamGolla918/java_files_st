import java.util.Scanner;

class FirstClass
{
    public static void main(String[] Args) 
    {   
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number to check Palindrome or not");
        int i = sc.nextInt() , rem = 0 , n = 0;
        int temp = i;
        while(i>0){
        rem = i % 10;
        i  = i / 10;
        n = n * 10 + rem ;
        }
        //System.out.println(n);
        if(n == temp)
            System.out.println("Its Pali");
        else
            System.out.println("Its not Pali");
        sc.close();
    }
}