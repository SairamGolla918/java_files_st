package GrandTest;

import java.util.*;
import java.util.Map.Entry;
public class HashMapbyValue
{


	public static void main(String[] args) 
	{
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		map.put(0,9);
		map.put(1,3);
		map.put(2,4);
		map.put(3,0);
		map.put(4,10);
		
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);  
	
	}
}
