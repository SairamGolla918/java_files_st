// 4) Write a java program to display reverse of a word in a sentence?
// input:
// This is java class 
// output:
// sihT si avaj ssalc

package Strings;

public class WordRevInSen 
{
    String Reverse(String str)
    {
        String str1[] = str.split(" ");
        String rev = "";
        for (int i = 0; i < str1.length; i++) 
        {
            String temp = "";
            for (int j = 0; j < str1[i].length(); j++) 
            {
                temp = str1[i].charAt(j) + temp;
            }
            rev = rev+temp+" ";
            temp = ""; 
        }
        return rev;
    }
    public static void main(String[] args) 
    {
        WordRevInSen obj = new WordRevInSen();
        System.out.println(obj.Reverse("This is java class"));
    }
       
}
