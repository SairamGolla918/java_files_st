package Inheritance;

class Address 
{
    String city,state,country;

    Address(String city,String state,String country)
    {
        this.city = city;
        this.country = country;
        this.state = state;
    }
    
}
public class Aggregation
{
    String EmpName;
    int Empid;
    Address address;
    Aggregation(Address address,String EmpName,int Empid)
    {
        this.EmpName =EmpName;
        this.Empid = Empid;
        this.address =address;
    }
    
}