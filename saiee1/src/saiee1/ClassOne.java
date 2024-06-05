package saiee1;

public class ClassOne

{
	public int EmpID;
	public String EmpName;
	public int EmpSalary;

public ClassOne() {
		
	}

	public ClassOne(int empID, String empName, int empSalary) {
		super();
		EmpID = empID;
		EmpName = empName;
		EmpSalary = empSalary;
	}
	protected void show()
	{
		System.out.println("ClassOne");
	}
	@Override
	public String toString() {
		return "ClassOne [EmpID=" + EmpID + ", EmpName=" + EmpName + ", EmpSalary=" + EmpSalary + "]";
	}
	public static void main(String[] args)
	{
		ClassOne emp1 = new  ClassOne(1,"saiee",60000);
		System.out.println(emp1);
		emp1.show();
	}
	

}
