import java.util.Scanner;

public class TestComplex {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first complex number: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		
		System.out.print("Enter the second complex number: ");
		double c = input.nextDouble();
		double d = input.nextDouble();
		
		Complex c1 = new Complex(a, b);
		Complex c2 = new Complex(c, d);
		
		System.out.println(c1.toString() + " + " + c2.toString() + " = " + c1.add(c2));
		System.out.println(c1.toString() + " - " + c2.toString() + " = " + c1.subtract(c2));
		System.out.println(c1.toString() + " * " + c2.toString() + " = " + c1.multiply(c2));
		System.out.println(c1.toString() + " / " + c2.toString() + " = " + c1.divide(c2));
		System.out.println("|" + c1.toString() + "|" + " = " + c1.abs());
		
	}
}
