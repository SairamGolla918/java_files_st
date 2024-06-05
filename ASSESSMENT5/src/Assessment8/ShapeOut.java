package Assessment8;

public class ShapeOut 
{
	public static void main(String[] args)
	{
		Rectangle R = new Rectangle();
		System.out.println("Area of Rectangle : " + R.getArea(1.0,2.0));
		Circle C = new Circle();
		System.out.println("Area of Circle : " + C.getArea(2.0));
		Triangle T = new Triangle();
		System.out.println("Area of Triangle : "+C.getArea(2.0,3.0));
	}

}
class Rectangle implements Shape
{
	public double getArea(double ... i)
	{
		return i[0]*i[1];
	}
}

class Circle implements Shape
{
	public double getArea(double ... i)
	{
		return 3.14*i[0]*i[0];
	}
}

class Triangle implements Shape
{
	public double getArea(double ... i)
	{
		return 0.5*i[0]*i[1];
	}
}

