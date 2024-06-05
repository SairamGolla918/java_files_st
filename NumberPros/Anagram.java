//No of Characters Should be equal
//the Character Frequency should be equal

import java.util.Scanner;

public class Anagram 
{ 
    public static void main(String[] args) 
    {
        //Scanner scan = new Scanner(System.in);
        String A = "Hello";
        String a = "hello";

        int lenA = A.length();
        int lena = a.length();

        Boolean isAnagram = false; 

        if(lenA == lena )
        {   
            int sumA = 0;
            long productA = 1;
            int suma = 0;
            long producta = 1;
            for(int i = 0;i<lenA;i++)
            {   
                A = A.toLowerCase();
                a = a.toLowerCase();
                char charA = A.charAt(i);
                char chara = a.charAt(i);

                sumA = sumA + (int)charA;
                productA = productA * (int)charA;

                suma = suma + (int) chara;
                producta = producta * (int)chara;

                

                if((sumA == suma )&& (productA == producta))
                    isAnagram = true;
                else
                    isAnagram = false;
            }    
        }
        else
                isAnagram = false;
        if(isAnagram)
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");
        
        
    }
    
}