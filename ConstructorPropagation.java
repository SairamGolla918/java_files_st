class Employee
{
    int EmpId;
    String EmpName;
    int Salary;
    String Qual;
    Employee()
    {
        System.out.println("Employee");
    }
    Employee(int EmpId,String EmpName,int Salary,String Qual)
    {
        this.EmpId = EmpId;
        this.EmpName = EmpName;
        this.Salary = Salary;
        this.Qual = Qual;
    }
    public String toString()
    {

        return EmpId+" "+EmpName+" "+Salary+" "+Qual;
    }
}

    
class Programmer extends Employee
{
    String Project;
    String Module;
    int Experience;
    Programmer(int EmpId, String EmpName, int Salary, String Qual,int Experience,String Module,String Project)
    {
        //super(EmpId,EmpName,Salary,Qual);
        this.Project = Project;
        this.Module = Module;
        this.Experience = Experience;
    }
    public String toString()

    {

        return super.toString()+ Project + " " + Module + " " + Experience;
       
    }

}

class StudentTribe
{
    public static void main(String[] args)
    {
        Programmer p1 = new Programmer(918,"Saiee",50000," Btech",1, "Studnet", "College");
        System.out.println(p1);
    }
}

