package GrandTest;

import java.util.*;
import java.util.Map.Entry;
public class HashMapbyValue
{


	public static void main(String[] args) 
	{
		Map<Integer,Character> map = new HashMap<Integer,Character>();
		
		map.put(0,'a');
		map.put(1,'B');
		map.put(2,'C');
		map.put(3,'z');
		map.put(4,'A');
		
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::print);  
	
	}
}
