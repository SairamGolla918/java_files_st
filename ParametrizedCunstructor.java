class Employee
{
    int EmpId;
    String EmpName;
    String EmpRole;
    int EmpSalary;

    Employee(int EmpId,String EmpName,String EmpRole,int EmpSalary)
    {
        this.EmpId = EmpId;
        this.EmpName = EmpName;
        this.EmpRole = EmpRole;
        this.EmpSalary = EmpSalary;
    }
    void show()
    {
        System.out.println(EmpId+" "+EmpName+" "+EmpRole+" "+EmpSalary);
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee(918,"Saiee","Dev",30000);
        emp1.show();
    }
}
