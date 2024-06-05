class ThisTest 
{
    int n1;
    int n2,n3;
    String Saiee;
    ThisTest()
    {
        System.out.println("ThisTest");
    }
    ThisTest(int n1,int n2, int n3 )
    {
        System.out.println("ThisTest(int n1)");
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;

    }
    ThisTest(int n1,int n2,int n3,String Saiee)
    {
        this(n1,n2,n3);
        System.out.println("ThisTest(int n1,int n2)");
        
        this.Saiee = Saiee;
        
    }
    public String toString()
    {
        return n1+" " +n2 + " " + n3 + " "+ Saiee;
    }
}

class ThisTestOut
{
    public static void main(String[] a)
    {
        ThisTest t1 = new ThisTest(1,2,3,"Saiee");
        System.out.println(t1);
    }
}
    



