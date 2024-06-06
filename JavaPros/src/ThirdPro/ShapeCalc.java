package ThirdPro;

public abstract class ShapeCalc 
{

	abstract double CalculateArea(double... a);
	
	public static void main(String[] args)
	{
		Circle c = new Circle();
		System.out.println(c.CalculateArea(3));
		Rectangle r = new Rectangle();
		System.out.println(r.CalculateArea(3,4));
		Triangles t = new Triangles();
		System.out.println(t.CalculateArea(3,4));
		
	}
}


class Circle extends ShapeCalc
{
	double CalculateArea(double... a)
	{
		return 3.14*a[0]*a[0];
	}
}

class Rectangle extends ShapeCalc
{
	double CalculateArea(double... a)
	{
		return a[0]*a[1];
	}
}

class Triangles extends ShapeCalc
{
	double CalculateArea(double... a)
	{
		return 0.5*a[0]*a[1];
	}
}
