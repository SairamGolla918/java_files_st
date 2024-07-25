// 9) You are implementing a shopping cart for an e-commerce website. Write a Java code 
// snippet to calculate the total price of the items in the cart.

package GrandTest2;

import java.util.*;

public class PriceCart 
{
    public static void main(String[] args) 
    {
        Map<String,Integer> map = new HashMap<String,Integer>();
		
		map.put("Shirt",500);
		map.put("Pant",1000);
		map.put("Hoodie",600);
		map.put("Cargo",1100);
		map.put("Shoes",1500);

        
        int Total = 0;

        for(Map.Entry m:map.entrySet()) 
        {
            int i = (int) m.getValue();
            Total = Total + i ;
        }
        System.out.println("total price of the items : "+Total);
    }
}
