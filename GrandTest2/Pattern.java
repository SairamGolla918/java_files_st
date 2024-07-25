// 2) Write a java program to display the given string in below format? 
// Input: 
//  ABBCCCDDDD 
// Output: 
//  A1B2C3D4 

package GrandTest2;

public class Pattern 
{
    public static void main(String[] args) 
    {
        String str = "ABBCCCDDDD";
        String str1 =""; 
        for (int i = 0; i < str.length(); i++)
        {
            int count = 1;
            for (int j = i+1; j < str.length(); j++) 
            {
                if(str.charAt(i) == str.charAt(j))
                    count++;
            }
            if(count == 1)
                str1 = str1 + str.charAt(i);

        }
        String res = "";
        for (int i = 0; i < str1.length(); i++)
        {
            int count = 0;
            for (int j = 0; j < str.length(); j++) 
            {
                if(str1.charAt(i) == str.charAt(j))
                    count++;
            }
            if(count >= 1)
                res = res + str1.charAt(i)+count;

        }
        System.out.println(res);
    }
}
