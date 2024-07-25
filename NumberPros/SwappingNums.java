public class SwappingNums 
{
    public static void main(String[] args) 
    {
       int i = 10 , j = 2;
       i = i + j;
       j = i - j;
       i = i - j;

    //    i = i ^ j;
    //    j = i ^ j;
    //    i = i ^ j;


       System.out.println(i+" "+j);
     
    }
}
