class A implements Cloneable
{
		public static void main(String[] ar) throws Exception
		{
			A a=new A();
			A b=(A)a.clone();
			System.out.println(a==b);
		}
			
}
