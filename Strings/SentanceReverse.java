// 3) Write a java program to display reverse of a sentence?
// input:
// This is java class
// output:
// class java is This

package Strings;

public class SentanceReverse 
{
    String Reverse(String str)
    {
        String str1[] = str.split(" ");
        String rev = "";
        for (int i = str1.length-1; i >= 0 ; i--) 
        {
            rev = rev+str1[i]+" " ; 
        }
        return rev;
    } 
    public static void main(String[] args) 
    {
        SentanceReverse obj = new SentanceReverse();
        System.out.println(obj.Reverse("This is java class"));
    }
}
