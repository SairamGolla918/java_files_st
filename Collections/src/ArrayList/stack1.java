package ArrayList;

import java.util.*;

class Student
{
	int Id;
	String name;
	int age;
	Student(int Id,String name,int age)
	{
		this.Id = Id;
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", name=" + name + ", age=" + age + "]";
	}
	
	
}

public class stack1 
{
	public static void main(String[] args) 
	{
		
	
    //Scanner sc = new Scanner(System.in);
    //System.out.println("Enter the size :");
//    int n = sc.nextInt();
//    int top = -1;
    ArrayList<Student> List1 = new ArrayList<Student>();
    
    Student s1 = new Student(1,"saiee",22);
    Student s2 = new Student(2,"sai",23);
    Student s3 = new Student(3,"sri",21);
    		
//    for(int i = 0;i < n;i++)
//    {
//        System.out.println("Enter the element :");
//        Integer element = sc.nextInt();
//        List1.add(element);
//        
//        
//        top++;
//    }
    List1.add(s1);
    List1.add(s2);
    List1.add(s3);
    
     
   // System.out.println(List1.get(top));
    
    Iterator itr =List1.iterator();
    
    while(itr.hasNext())
    {
    	Student st = (Student)itr.next();
    	System.out.println(st.Id+" "+st.name+" "+st.age);
    }
    
    for(Student a:List1)
    {
    	System.out.println(a);
    }
    
    List1.forEach(a->{System.out.println(a);});
    System.out.println("last");
    Iterator itr1 =List1.iterator();
    itr1.forEachRemaining(a->{System.out.println(a);});
    
	}
	
    
}