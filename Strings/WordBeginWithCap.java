// 5) Write java program to display number of words starts with capital letter in a given string?
// input:
// This is Java Class for Programming part
// output:
// This Java Class Programming
package Strings;

public class WordBeginWithCap 
{
    
    String CapitalWords(String str)
    {
        String Arr[] = str.split(" ");
        String res = "";

        for (int i = 0; i < Arr.length; i++) 
        {
            if(('A' <= Arr[i].charAt(0)) && (Arr[i].charAt(0)<= 'Z'))
                res = res + Arr[i]+" ";
        }

        return res;
    }
    public static void main(String[] args) 
    {
        WordBeginWithCap obj = new WordBeginWithCap();

        System.out.println(obj.CapitalWords("This is Java Class for Programming part"));
    }
}
