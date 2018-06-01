
public class TestCourse {
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Course c1 = new Course("Math");
		Course c2 = (Course)c1.clone();
		
		System.out.println(c1.getStudents().equals(c2.getStudents())); // Deep copy for students field
		System.out.println(c1.getCourseName().equals(c2.getCourseName()));	// Shallow copy for the rest of the field
	}
}
