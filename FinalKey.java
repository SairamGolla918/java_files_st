class FinalKey 
{
    int i;
    final int j;

    FinalKey(int i ,int j )
    {
        this.i = i;
        this.j = 20;
        
    }

    public String toString()
    {
        return i + " "+ j;
    }
}

class FinalOut
{
    public static void main(String[] args) 
    {
        FinalKey f1 = new FinalKey(1,7);
        System.out.println(f1);

    }
}
