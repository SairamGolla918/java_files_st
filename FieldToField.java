
//Clone Demo

class Student 
{   
    int StuId;
    String StuName;
    String StuClass;
    int StuRoll;
    Student()
    {

    }
    Student(int StuId,String StuName,String StuClass,int StuRoll)
    {
        this.StuId = StuId;
        this.StuName = StuName;
        this.StuClass = StuClass;
        this.StuRoll = StuRoll;
    }
    // public String toString()
    // {
    //     return StuId+" "+StuName+" "+StuClass+" "+StuRoll;
    // }
    public static void main(String[] args) 
    {
        Student student1 = new Student(180918, "Saiee", "CSE", 69);
        Student student2 = new Student();
        student2.StuId = student1.StuId;
        student2.StuName = student1.StuName;
        student2.StuClass = student1.StuClass;
        student2.StuRoll = student1.StuRoll;
        System.out.println(student2.toString());

    }
}
