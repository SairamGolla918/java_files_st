class forCheck 
{
    public static void main(String[] args) 
    {
        for (int i = 0,j = 9,k = 20; (i < 10 || j < 10) ^ j < 10 && k < 21; i++,j++,k++) 
        {
            System.out.println("Hai " + i + " "+j+" "+k);    
        }    
    }    
}
