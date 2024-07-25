// 6) Write a Java program to check given string is well formed/Balanced or 
// not by using collections?
//  Input:
//  ([{}]) 
//  Output: 
//  Balanced 



package GrandTest2;

public class CharCheck 
{
    public static void main(String[] args) 
    {
        String str = "([{}])";
        boolean check = false;
        
        for (int i = 0; i < (str.length()/2); i++)
        {
            int j = str.length()-i-1;
            char c1 = str.charAt(i);
            char c2 = str.charAt(j);
            if(c1 == '('  && c2 == ')')
            {
                check=true;
            }
            else if(c1 == '['  && c2 == ']')
            {
                check=true;
            }
            else if(c1 == '{'  && c2 == '}')
            {
                check=true;
            }
            else
                check = false;
            
        }
        if(check)
            System.out.println("Balanced");
        else    
            System.out.println("Formed");
    }
}
