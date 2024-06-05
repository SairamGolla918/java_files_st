package Assessment8;

public class CloneDemo implements Cloneable 
{
	int i;
	int j;
	
	public CloneDemo() {
		super();
	}

	public CloneDemo(int i,int j) 
	{
		this.i = i;
		this.j = j;
	}
	
	@Override
	public String toString() {
		return "CloneDemo [i=" + i + ", j=" + j + "]";
	}

	public static void main(String[] a) throws CloneNotSupportedException
	{
		CloneDemo c1 = new CloneDemo(12,14);
		CloneDemo c2 =(CloneDemo)c1.clone();
		System.out.println(c2);
	}
}
