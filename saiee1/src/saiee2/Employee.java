package saiee2;

public class Employee 
{
	
	
	private String name;
	protected String department;
	public double salary;
	

	Employee(String name, String department) {
		this.name = name;
		this.department = department;
	}
	public double getSalary(double salary)
	{
		return salary;
	}
	
	

	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
	public static void main(String[] args) 
	{
		
		Employee emp1 = new Employee("saiee","cse");
		System.out.println(emp1);
		
		
	}

}