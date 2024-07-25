// 2) Write a java program to check given string is palindrome or not?
// input:
// racar 
// output:
// It is a palindrome string


package Strings;

public class StringPali 
{
    String Reverse(String str)
    {
        String rev = "";
        for (int i = 0; i < str.length(); i++) 
        {
            rev = str.charAt(i) + rev ; 
        }
        return rev;
    }  
    public static void main(String[] args) 
    {

        StringPali obj = new StringPali();
        String rev = obj.Reverse("racar");
        if(rev.equals("racar"))
            System.out.println("It is a palindrome string");
        
        
    }
}
