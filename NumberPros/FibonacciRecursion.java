public class FibonacciRecursion 
{
    static int n1 = 0 ,n2 = 1,n3=0; 
    static void recurFib(int count)
    {
        if(count > 0)
        { 
            System.out.print(n1+" ");
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            recurFib(count - 1);
        }
    }
    public static void main(String[] args)
    {
        int count = 10;
        //System.out.println(n1+" "+n2);
        recurFib(count);

    }
}
