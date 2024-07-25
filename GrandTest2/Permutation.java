// 1) Write a java program to display permutation given string? 
//  Input: 
//  ABC 
//  output: 
//  ABC 
//  ACB 
//  BAC 
//  BCA 
//  CBA 
//  CAB 

package GrandTest2;


import java.util.*;

public class Permutation 
{
    
    public static void main(String[] args) 
    {
        String str = "ABC";
        
        List<String> list = new ArrayList();
        for (int i = 0; i < str.length(); i++)
        {
            
            for (int j = 0; j < str.length(); j++) 
            {
                if(j != i)
                {
                    for (int k = 0; k < str.length(); k++) 
                    {
                        if(k!=j && k!=i)
                        {
                            String s =  ""+str.charAt(i)+str.charAt(j)+str.charAt(k);
                            list.add(s);
                        }
                    }
                }
               
            }   
           
        }
        for (String string : list)
        {
            System.out.println(string);
        }
        

    }
}
