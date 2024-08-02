package emp;

import java.util.*;

public class Main 
{

	public static void main(String[] args) 
	{
		PayrollSystem ps = new PayrollSystem();
		
		Scanner scanner = new Scanner(System.in);
		int select;
		do
		{
			System.out.println("\nEmployee Payroll System:");
			System.out.println("Enter 1 to Add Full-Time Employee");
	        System.out.println("Enter 2 to Add Part-Time Employee");
	        System.out.println("Enter 3 to Remove Employee");
	        System.out.println("Enter 4 Display All Employees");
	        System.out.println("Enter 5 Exit");
	        System.out.print("Select from above options : ");
	        System.out.println();
			select = scanner.nextInt();
			
			
			if(select == 1)
			{
				System.out.print("Enter ID: ");
	            int ftId = scanner.nextInt();
	            scanner.nextLine();  // Consume newline
	            System.out.print("Enter Name: ");
	            String ftName = scanner.nextLine();
	            System.out.print("Enter Designation: ");
	            String ftDesignation = scanner.nextLine();
	            System.out.print("Enter Salary: ");
	            double ftSalary = scanner.nextDouble();
	            ps.addEmp(new FullTimeEmployee(ftId, ftName, ftDesignation, ftSalary));
	          
			}
			else if(select == 2)
			{
				System.out.print("Enter ID: ");
	            int ptId = scanner.nextInt();
	            scanner.nextLine();  // Consume newline
	            System.out.print("Enter Name: ");
	            String ptName = scanner.nextLine();
	            System.out.print("Enter Designation: ");
	            String ptDesignation = scanner.nextLine();
	            System.out.print("Enter Hours Worked: ");
	            int hoursWorked = scanner.nextInt();
	            System.out.print("Enter Hourly Rate: ");
	            double hourlyRate = scanner.nextDouble();
	            ps.addEmp(new PartTimeEmployee(ptId, ptName, ptDesignation, hoursWorked, hourlyRate));
	            
			}
			else if(select == 3)
			{
				System.out.print("Enter Employee ID to Remove: ");
	            int removeId = scanner.nextInt();
	            ps.removeEmp(removeId);
			}
			else if(select == 4)
			{
				ps.displayEmps();
			}
			else if(select == 5)
			{
				System.out.println("Exiting...");
			}
			else
			{
				System.out.println("Check the Selection. Please try again.");
			}
		}
		while(select != 5);
		
		
		

	}

}
