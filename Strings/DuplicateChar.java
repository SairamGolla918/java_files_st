// 6) Write a java program to display duplicate characters from given string?
// input: google
// output:
// o g


// 7) Write a java program to display distinct characters from given string?
// input:
// google
// output:
// g o l e
package Strings;

public class DuplicateChar 
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
        System.out.print(str1);
    }    
}
