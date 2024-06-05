import java.util.Scanner;

class DigitsSum {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");

        int i = sc.nextInt() , rem = 0 , sum = 0;
        while(i>0){
            rem = i % 10;
            i = i / 10;
            sum = sum + rem;

        }
        System.out.println(sum);
        sc.close();
    }

    
}
