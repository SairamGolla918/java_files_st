// 10) Write a java program to find out most repeating character from given string?
// input:
// ihubtalentmanagementsolutionit
// output:
// t is repeating for 5 times
package Strings;

public class MostRepeated 
{
    public static void main(String[] args) 
    {
        String s = "ihubtalentmanagementsolutionit";
        
        int max = 0; 
        int index = 0;
        for (int i = 0; i < s.length(); i++) 
        {
            int count = 1;
            for (int j = i+1; j < s.length(); j++) 
            {
                if(s.charAt(i) == s.charAt(j))
                    count++;
            } 
            if(max < count)
            {
                max = count;
                index = i;
            }   
        }
        System.out.println(s.charAt(index)+" is repeating for "+max+" times");
    }    
}
