public class primeNum 
{
    public static void main(String[] args) 
    {
        int num = 11;
        boolean isPrime = false;
        for(int i = 2 ; i < num ; i++ )
        {
            if(num % i == 0)
                isPrime = false;
            else
                isPrime = true;
        }
        if((isPrime))
            System.out.println("Prime");
        else if(num == 2)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}
