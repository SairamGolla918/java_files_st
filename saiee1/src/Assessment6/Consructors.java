package Assessment6;

public class Consructors {
	
	int i;
	int j;
	String k;
	float f;
	double d;
	Consructors()
	{
		System.out.println("without Arguments");
	}
	public Consructors(int i, int j, String k, float f, double d) 
	{
		super();
		this.i = i;
		this.j = j;
		this.k = k;
		this.f = f;
		this.d = d;
		System.out.println("With Arguements");
	}
	@Override
	public String toString() {
		return "Consructors [i=" + i + ", j=" + j + ", k=" + k + ", f=" + f + ", d=" + d + "]";
	}
	public static void main(String[] args)
	{
		Consructors C1 = new Consructors(1,2,"St33",5.00f,5.5);
		System.out.println(C1);
	}
}

class Constructors extends Consructors
{
	int a;
	public Constructors(int i, int j, String k, float f, double d, int a) 
	{
		super(i, j, k, f, d);
		this.a = a;
	}
	
	@Override
	public String toString() {
		return "Constructors [a=" + a + "]"+super.toString();
	}

	public static void main(String[] args) 
	{
		
	}
	
}
