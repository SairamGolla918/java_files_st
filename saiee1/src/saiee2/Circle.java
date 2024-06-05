package saiee2;

public class Circle {
	
	double radius;
	
	Circle(double radius) 
	{
		this.radius = radius;
	}
	Circle()
	{
		this.radius = 1.0;
	}
	
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	public static void main(String[] args) {
		Circle c1 = new Circle();
		System.out.println(c1);
		Circle c2 = new Circle(2.0);
		System.out.println(c2);
		
	}

}
