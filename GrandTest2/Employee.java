package GrandTest2;


import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>
{
	int Empid;
	String EmpName;
	float Salary;
	
	Employee()
	{
	}
	public Employee(int empid, String empName, float salary) 
	{
		super();
		this.Empid = empid;
		this.EmpName = empName;
		this.Salary = salary;
		
	}
	
	@Override
	public String toString() {
		return "Employee [Empid=" + Empid + ", EmpName=" + EmpName + ", Salary=" + Salary +"]";
	}
	public int compareTo(Employee e) 
	{
		if(this.Salary < e.Salary)
			return 1;
		else if(this.Salary > e.Salary)
			return -1;
		else
            return 0;
			
			
			
	}
	public static void main(String[] args) 
	{
		
		Employee obj = new Employee(901,"Sai",800000);
		Employee obj1 = new Employee(902,"Anil",800000);
		Employee obj2 = new Employee(903,"Kesav",820000);
		Employee obj3 = new Employee(904,"Nikki",890000);
		Employee obj4 = new Employee(904,"Saiee",890000);
		
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



