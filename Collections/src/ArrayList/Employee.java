package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>
{
	int Empid;
	String EmpName;
	float Salary;
	Address address;
	Employee()
	{
	}
	public Employee(int empid, String empName, float salary,Address address) 
	{
		super();
		this.Empid = empid;
		this.EmpName = empName;
		this.Salary = salary;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Employee [Empid=" + Empid + ", EmpName=" + EmpName + ", Salary=" + Salary + ", address=" + address
				+ "]";
	}
	public int compareTo(Employee e) 
	{
		if(this.Salary < e.Salary)
			return 1;
		else if(this.Salary > e.Salary)
			return -1;
		else
		{
			int i = this.EmpName.compareTo(e.EmpName);
			if (i==0)
			{
				if(this.Empid < e.Empid )
					return 1;
				else if(this.Empid > e.Empid)
					return -1;
				else
					return 0;
			}
			return i;
		}	
	}
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



