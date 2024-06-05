package Aggregation;

public class Employee 
{	
	String EmpName;
	int EmpId;
	int Salary;
	Address address;
	public Employee(String empName, int empId, int salary, Address address)
	{
		super();
		EmpName = empName;
		EmpId = empId;
		Salary = salary;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [EmpName=" + EmpName + ", EmpId=" + EmpId + ", Salary=" + Salary + ", address=" + address
				+ "]";
	}
	public static void main(String[] args) 
	{
		Address add = new Address(928,"SSR nagar","Nandikotkur",518401);
		Employee emp = new Employee("Saiee",918,90000,add);
		System.out.println(emp);
	}
	
	

}
