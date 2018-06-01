
public class Triangle extends GeometricObject{
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle()
	{		
	}
	
	public Triangle(double side1, double side2, double side3, String color, boolean filled)
	{
		super(color, filled);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	@Override
	public double getArea() 
	{
		double p = getPerimeter() / 2;
		return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
	}

	@Override
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + "\nArea: " + String.format("%.2f", getArea()) + "\nPerimeter: " + getPerimeter();
	}
}
