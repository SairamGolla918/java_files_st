package emp;

import java.util.*;

public abstract class Employee 
{

	int Id;
	String Name;
	String Designation;
	
	Employee(int Id,String Name,String Designation)
	{
		this.Id = Id;
		this.Name = Name;
		this.Designation = Designation;
	}
	
	
	public int getId() 
	{
		return Id;
	}


	public String getName() 
	{
		return Name;
	}



	public String getDesignation() 
	{
		return Designation;
	}

	@Override
	public String toString() 
	{
		return "Employee [Id=" + Id + ", Name=" + Name + ", Designation=" + Designation + "]";
	}
	abstract double calculateSal();
	

}

class FullTimeEmployee extends Employee 
{
	Double Salary;
	public FullTimeEmployee(int Id, String Name, String Designation,Double Salary) 
	{
		super(Id,Name,Designation);
		this.Salary = Salary;
	}
	
	
	public double calculateSal()
	{
		return Salary;
	}


	@Override
	public String toString() {
		return "FullTimeEmployee [Salary=" + Salary + ", Id=" + Id + ", Name=" + Name + ", Designation=" + Designation
				+ "]";
	}
	

}
class PartTimeEmployee extends Employee
{
	int hourlyWorked;
	double hourlyRate;
	public PartTimeEmployee(int Id, String Name, String Designation, int hourlyWorked, double hourlyRate) 
	{
		super(Id, Name, Designation);
		this.hourlyWorked = hourlyWorked;
		this.hourlyRate = hourlyRate;
	}
	
	public double calculateSal()
	{
		return hourlyWorked * hourlyRate;
	}

	@Override
	public String toString() {
		return "PartTimeEmployee [hourlyWorked=" + hourlyWorked + ", hourlyRate=" + hourlyRate + ", Id=" + Id
				+ ", Name=" + Name + ", Designation=" + Designation + "]";
	}
	
	
}
	
class PayrollSystem 
{
	ArrayList<Employee> Emplist = new ArrayList<>();
	
	public void addEmp(Employee e)
	{
		Emplist.add(e);
		System.out.println(e.getName()+" added to the Employee");
	}
	
	public void removeEmp(int Id)
	{
		
		
		for(Employee emp:Emplist)
		{
			if(emp.getId() == Id)
			{
				Emplist.remove(emp);
				 System.out.println("Employee removed: " + emp.getName());
			}
			return;
		}
		System.out.println("The Employee "+Id+" Not Found");

	}
	
	public void displayEmps()
	{
		if(Emplist.isEmpty())
		{
			System.out.println("No Employees Found");
		}
		else
		{
			for(Employee emp: Emplist)
			{
				System.out.println(emp+" Salary "+emp.calculateSal());
				
			}
		}
	}
	
	
}

