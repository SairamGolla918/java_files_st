import java.util.Scanner;

class FibonacciOrNot
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num1 = sc.nextInt();
        int num = num1 , n1 = 0 ,n2 = 1,n3 = 0;
        boolean flag = false;
        while(n3 < num)
        {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
           
            if(n3 == num)
            {
                System.out.println("Its Fibonacci");
                flag = true;
                break;
            }

        }
        if(flag == false)
            System.out.println("Its not Fibnooci");

        sc.close();
    }
}
