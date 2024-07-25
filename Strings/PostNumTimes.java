// 8) Write a java program to display given string?
// input:
// A1B2C3D4
// output:
// ABBCCCDDDD

package Strings;

public class PostNumTimes 
{
    public static void main(String[] args)
    {
        String str = "A1B2C3D4E5";
        String res = "";
        for (int i = 0; i < str.length()-1; i+=2) 
        {
            char c = str.charAt(i+1);
            
            for (int j = 0; j < (c - '0'); j++) 
            {
                res = res + str.charAt(i);
            }
             
        }
        System.out.println(res);
    }
}
