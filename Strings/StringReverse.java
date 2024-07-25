// 1) Write a java program to display reverse of a given String?
// input:
// hello
// output:
// olleh



package Strings;

public class StringReverse 
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
        StringReverse obj = new StringReverse();
        System.out.println(obj.Reverse("hello"));
    }  
}
