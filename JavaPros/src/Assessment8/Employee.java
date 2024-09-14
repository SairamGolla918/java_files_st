package Assessment8;

import java.util.*;

public class Employee 
{
	int empId;
	String empName;
	int  empAge;
	public Employee() 
	{
		
	}

	public Employee(int empId, String empName, int empAge) 
	{
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
	}
	

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + "]";
	}

	public static void main(String[] args) 
	{
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee(211,"Saiee",22));
		list.add(new Employee(221,"Siva",24));
		list.add(new Employee(243,"Kaviee",28));
		list.add(new Employee(143,"Lokesh",22));
		list.add(new Employee(420,"Sudha",21));
		
		for(Employee e:list)
		{
			if(e.empAge<23)
			{
				System.out.println(e);
			}
		}

	}

}
