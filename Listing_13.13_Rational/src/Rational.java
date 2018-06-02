
public class Rational extends Number implements Comparable<Rational>
{
	// Data fields for numerator and denominator
	private long numerator;
	private long denominator;

	/** Construct a rational with default properties */
	public Rational()
	{
		this(0, 1);
	}

	/** Construct a rational with specified numerator and denominator */
	public Rational(long numerator, long denominator)
	{
		long gcd = gcd(numerator, denominator);
		this.numerator = ((denominator > 0) ? 1 : -1) * numerator / gcd;
		this.denominator = Math.abs(denominator) / gcd;
	}

	public long getNumerator()
	{
		return numerator;
	}

	public long getDenominator()
	{
		return denominator;
	}

	/** Add a rational number by this rational number */
	public Rational add(Rational secondRational)
	{
		long n = numerator * secondRational.getDenominator() + denominator * secondRational.getNumerator();
		long d = denominator * secondRational.getDenominator();
		return new Rational(n, d);
	}

	/** Subtract a rational number by this rational number */
	public Rational subtract(Rational secondRational)
	{
		long n = numerator * secondRational.getDenominator() - denominator * secondRational.getNumerator();
		long d = denominator * secondRational.getDenominator();
		return new Rational(n, d);
	}

	/** Multiply a rational number by this rational */
	public Rational multiply(Rational secondRational)
	{
		long n = numerator * secondRational.getNumerator();
		long d = denominator * secondRational.getDenominator();
		return new Rational(n, d);
	}

	/** Divide a rational number by this rational */
	public Rational divide(Rational secondRational)
	{
		long n = numerator * secondRational.getDenominator();
		long d = denominator * secondRational.getNumerator();
		return new Rational(n, d);
	}

	@Override
	public String toString()
	{
		if(denominator == 1)
			return numerator + "";
		else
			return numerator + "/" + denominator;
	}

	/** Find GCD of two numbers */
	private static long gcd(long n, long d)
	{
		long n1 = Math.abs(n);
		long n2 = Math.abs(d);
		int gcd = 1;
		
		for(int k = 1; k <= n1 && k <= n2; k++)
		{
			if(n1 % k == 0 && n2 % k == 0)
			{
				gcd = k;
			}
		}
		
		return gcd;
	}

	/** Implement the compareTo method in comparable */
	@Override
	public int compareTo(Rational o)
	{
		if(this.subtract(o).getNumerator() > 0)
			return 1;
		else if(this.subtract(o).getNumerator() < 0)
			return -1;
		else 
			return 0;
	}
	
	/** Override the equals method in the Object class */
	@Override
	public boolean equals(Object other)
	{
		if((this.subtract((Rational)(other))).getNumerator() == 0)
			return true;
		else
			return false;
	}
	
	@Override
	public double doubleValue()
	{
		return numerator * 1.0 / denominator;
	}
	
	@Override
	public float floatValue()
	{
		return (float)doubleValue();
	}
	
	@Override
	public int intValue()
	{
		return (int)doubleValue();
	}
	
	@Override
	public long longValue()
	{
		return (long)doubleValue();
	}
}
