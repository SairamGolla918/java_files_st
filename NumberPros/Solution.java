import java.io.*;
import java.util.*;

public class Solution
{

    public static void main(String[] args)
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //Scanner scan = new Scanner(System.in);
        int s = 1/*scan.nextInt()*/;
        for(int j = 1;j <= s;j++)
        {
            String str[] = "0 2 10".split(" ",3) /*scan.next().split(" ",3)*/;
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            int n = Integer.parseInt(str[2]);
            //System.out.println(str);
            
            int sum = 0;
            for(int i = 1 ;i <= n ; i++)
            {
                System.out.print(a+i*b+sum+" ");
                sum = sum + (a+i*b+sum);
            }
            
        }
        
       
    }
}
