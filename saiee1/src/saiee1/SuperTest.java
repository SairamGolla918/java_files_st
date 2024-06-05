package saiee1;

public class SuperTest
{
	int SupId;
	String SupName;
	SuperTest(int SupId,String SupName) 
	{
		this.SupId = SupId;
		this.SupName = SupName;
		System.out.println("SuperTest");
	}
	public String toString()
	{
		return SupId+" "+SupName;
	}
	public static void main(String[] a)
	{
		SuperDemo s1 = new SuperDemo(1,"saiee",2,"Ramm");
		System.out.println(s1);
		
	}

}

class SuperDemo extends SuperTest
{
	int DemoId;
	String DemoName;
	SuperDemo(int SupId,String SupName,int DemoId,String DemoName)
	{
		super(SupId,SupName);
		this.DemoId = DemoId;
		this.DemoName = DemoName;
		
	}
	public String toString()
	{
		return super.toString()+" "+DemoId+" "+DemoName;
	}
	
}