package saiee2;

public class MethodOverLoading
{
	void show()
	{
		System.out.println("Show");
	}
	void show(int i,String s)
	{
		System.out.println("Show int i , String s");
	}
	void show(int j,int k)
	{
		System.out.println("Show int j , int k");
	}
	

	public static void main(String[] args)
	{
		MethodOverLoading M1 = new MethodOverLoading();
		M1.show();
		M1.show(1,"Saiee");
		M1.show(2,3);

	}

}
