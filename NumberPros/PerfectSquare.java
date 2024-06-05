import java.util.Scanner;

class PerfectSquare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
    
        int num = sc.nextInt();
        int temp = num;
        for(int i=1;i<=num/2; i++){

            if(i*i == temp)
                System.out.println("Perfect Square");
          
        }
        sc.close();
    }
    
}
