package Aggregation;




class Address
{
    String city,state,country;

    Address(String city,String state,String country)
    {
        this.city = city;
        this.country = country;
        this.state = state;
    }

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + "]";
	}
    
    
}  


public class Employee
{
    String EmpName;
    int Empid;
    Address address;
    Employee(Address address,String EmpName,int Empid)
    {
        this.EmpName =EmpName;
        this.Empid = Empid;
        this.address =address;
    }
	@Override
	public String toString() {
		return "Employee [EmpName=" + EmpName + ", Empid=" + Empid + ", address=" + address + "]";
	}
    
	public static void main(String[] args) 
	{
		Address a1 = new Address("knl","Ap","India");
		Employee e = new Employee(a1,"saiee",1);
		System.out.println(e);
		
	}
    
}