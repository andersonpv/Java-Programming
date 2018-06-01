
public class TestTriangle
{
	public static void main(String[] args)
	{
		// Create five triangles pollymorphically
		GeometricObject[] triangles = {new Triangle(5, 8, 10, "red", true), new Triangle(15, 20, 19, "blue", false), 
				new Triangle(3, 6, 5, "white", true), new Triangle(10, 30, 21, "black", false), new Triangle(20, 20, 20, "purple", true)};
		
		// Display result
		for(GeometricObject t : triangles)
		{
			System.out.println(t.toString());
			System.out.println();
		}	
	}
}
