// 5) Write a java program on below loop patterns? 
//  2 
//  3 5 
//  7 11 13 
// 17 19 23 29


package GrandTest2;

public class PrimePattern 
{
    static boolean checkPrime(int n)
    {
        
        if(n<2)
            return false;
        for (int i=2;i<=n/2;i++) 
        {
            if(n%i==0)
                return false;
        }
        return true;
        
    }
    public static void main(String[] args) 
    {
        int n = 4;
        int prime = 2;
       for (int i = 0; i < n; i++) 
       {
            for (int j = 0; j < i+1; j++) 
            {
                while (checkPrime(prime)==false){
                    prime+=1;
                }
                System.out.print(prime+" ");
                prime+=1;
                    
            }
            System.out.println();
       }
    }
}
