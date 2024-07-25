package ArrayList;

import java.util.*;

public class Main
{
	public static void main(String[] args) 
	{
		Address add1 = new Address(212,"Raja Veedi","Kurnool","AndhraPradesh","India");
		Address add2 = new Address(256,"Dev Street","Hyderabad","Telangana","India");
		Address add3 = new Address(98,"Rani Junction","Kadapa","AndhraPradesh","India");
		Address add4 = new Address(1,"Shiva Nagar","Chennai","TamilNadu","India");
		Address add5 = new Address(9,"Singha Peta","Mumbai","MadhyaPradesh","India");
		
		Employee obj = new Employee(901,"Sai",800000, add1);
		Employee obj1 = new Employee(902,"Sai",800000, add2);
		Employee obj2 = new Employee(903,"Saiee",820000, add3);
		Employee obj3 = new Employee(904,"Yadav",890000, add4);
		Employee obj4 = new Employee(904,"Yaaa",890000 ,add5);
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(obj);
		al.add(obj1);
		al.add(obj2);
		al.add(obj3);
		al.add(obj4);
		
		Collections.sort(al);
		for(Employee e:al)
		{
			System.out.println(e);
		}
}
}



