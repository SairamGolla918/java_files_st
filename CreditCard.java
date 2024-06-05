class Bank
{
    String BankName;
    int IfscCode;
    String BankBranch;
    Bank(String BankName,int IfscCode,String BankBranch)
    {
        
        this.BankName = BankName;
        this.IfscCode = IfscCode;
        this.BankBranch = BankBranch;
        System.out.println("Bank");
        
    }
    public String toString()
    {
        return BankName+" "+IfscCode+" "+BankBranch;
    }
    
}
class Account
{
    String AccountType;
    int AccountId;

}

class CreditCard extends Bank
{
    String CreditCardType;
    int AnnaulFees;
    String CreditCardLimit;
    CreditCard(String BankName,int IfscCode,String BankBranch,String CreditCardType,int AnnaulFees)
    {
        super(BankName,IfscCode,BankBranch);
        this.CreditCardType = CreditCardType;
        this.AnnaulFees = AnnaulFees;
        System.out.println("CreditCard");
    }
    public String  toString()
    {
        return super.toString()+CreditCardType+" "+AnnaulFees;
    }
}

class Customer extends CreditCard
{
    String CustomerName;
    int CustomerId;
    int CreditCardLimit;
    Customer(String BankName,int IfscCode,String BankBranch,String CreditCardType,int AnnaulFees,String CustomerName,int CustomerId,int CreditCardLimit)
    {
        super(BankName, IfscCode, BankBranch, CreditCardType, AnnaulFees);
        this.CustomerName = CustomerName;
        this.CustomerId = CustomerId;
        this.CreditCardLimit = CreditCardLimit;
    }
    public String toString()
    {
        return super.toString()+ " "+CustomerName+" "+CustomerId+" "+CreditCardLimit;
    }

}
class Output
{
public static void main(String[] a)
{
    Customer c1 = new Customer("HDFC", 518401, "HYD", "VISA", 500, "Saiee", 918, 60000);
    System.out.println(c1);
}
}
