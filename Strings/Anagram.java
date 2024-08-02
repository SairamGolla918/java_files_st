package Strings;

public class Anagram 
{
    public static void main(String[] args) 
    {
        String str1 = "saiee";
        String str2 = "s";
        int len1 = str1.length();
        int len2 = str2.length();
        boolean isAna = false;
        if(len1 == len2)
        {
            boolean arr[] = new boolean[str1.length()];
            for (int i = 0; i < arr.length; i++)  
            {
                for (int j = 0; j < arr.length; j++) 
                {
                if(str1.charAt(i)==str2.charAt(j))
                        arr[i] = true;
                }
            }
            
            for (boolean b : arr) 
            {
                if(b)
                    isAna = true;
                else 
                    isAna = false;
            }
        }
        if(isAna)
            System.out.println("Anagrams");
        else
            System.out.println("No Anagrams");
    }
}
