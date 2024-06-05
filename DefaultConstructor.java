class Customer
{
    int CustId;
    String CustName;
    String Product;
    int Salary;


    void show()
    {
        System.out.println(CustId+" "+CustName+" "+Product+" "+Salary);
    }
    public static void main(String[] a)
    {
        Customer emp1 = new Customer();
        emp1.show();

    } 

}