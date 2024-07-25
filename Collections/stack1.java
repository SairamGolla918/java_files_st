package Collections;

import java.util.*;

public class stack1 
{

    public static void main(String[] args) {
        
   
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the size :");
    int n = sc.nextInt();
    int top = -1;
    ArrayList<Integer> List1 = new ArrayList<Integer>();
    
    for(int i = 0;i < n;i++)
    {
        System.out.println("Enter the element :");
        int element = sc.nextInt();
        List1.add(element);
        top++;
    }
     
    System.out.println(List1.get(top));
}
    
}
