
public class Complex {
	private double a;
	private double b;
	
	public Complex()
	{
		this(0, 0);
	}
	
	public Complex(double a)
	{
		this(a, 0);
	}
	
	public Complex(double a, double b)
	{
		this.a = a;
		this.b = b;
	}
	
	public String add(Complex c2)
	{
		return (a + c2.getRealPart()) + " + " + (b + c2.getImaginaryPart()) + "i";
	}
	
	public String subtract(Complex c2)
	{
		return (a - c2.getRealPart()) + " + " + (b - c2.getImaginaryPart()) + "i";
	}
	
	public String multiply(Complex c2)
	{
		double ac = a * c2.getRealPart();
		double bd = b * c2.getImaginaryPart();
		double bc = b * c2.getRealPart();
		double ad = a * c2.getImaginaryPart();
		return (ac - bd) + " + " + (bc + ad) + "i";
	}
	
	public String divide(Complex c2)
	{
		double ac = a * c2.getRealPart();
		double bd = b * c2.getImaginaryPart();
		double bc = b * c2.getRealPart();
		double ad = a * c2.getImaginaryPart();
		double cd2 = (c2.getRealPart() * c2.getRealPart()) + (c2.getImaginaryPart() * c2.getImaginaryPart());
		return (ac + bd) / cd2 + " + " + (bc - ad) / (cd2);
	}
	
	public double abs()
	{
		return Math.sqrt(a * a + b * b);
	}

	public double getRealPart()
	{
		return a;
	}
	
	public double getImaginaryPart()
	{
		return b;
	}	
	
	@Override
	public String toString()
	{
		return "(" + a + " + " + b + "i)";
	}
	
}	
