import java.util.Scanner;

class PerfectNum {
    public static void main(String[] args)
    {   
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :");
        
        int num = sc.nextInt(),sum = 0;
        for(int i = 1 ; i < 6;i++)
        {
            if(num % i == 0)
                sum = sum + i;
        }
        if (sum == num)
            System.out.println("Perfect Number");
        else
            System.out.println("Not a Perfect Number");
        sc.close();
    }

}
