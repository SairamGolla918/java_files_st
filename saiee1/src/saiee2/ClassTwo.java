package saiee2;

import saiee1.ClassOne;

public class ClassTwo extends ClassOne 
{
	
	int ProjectId;
	String ProjectName;
	public ClassTwo() 
	{
		
	}

	public ClassTwo(int empID, String empName, int empSalary,int ProjectId,String ProjectName) 
	{
		super(empID, empName, empSalary);
		this.ProjectId = ProjectId;
		this.ProjectName = ProjectName;
		
	}
	

	@Override
	public String toString()
	{
		return "ClassTwo [ProjectId=" + ProjectId + ", ProjectName=" + ProjectName + ", EmpID=" + EmpID + ", EmpName="
				+ EmpName + ", EmpSalary=" + EmpSalary + "]";
	}

	public static void main(String[] args) 
	{
		
		ClassOne emp1 = new ClassOne(1,"saiee",90000);
		System.out.println(emp1);
		ClassTwo P1 = new ClassTwo();
		P1.show();

	}

}
