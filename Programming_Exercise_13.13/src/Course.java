
public class Course implements Cloneable{
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;
	
	public Course(String courseName)
	{
		this.courseName = courseName;
	}
	
	public void addStudent(String student)
	{
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	
	public void dropStudent(String student)
	{	
		for(int i = 0; i < numberOfStudents; i++)
		{
			if(students[i].equals(student))
			{
				for(int j = i; j < numberOfStudents; j++)
				{
					students[j] = students[j + 1];			
					
				}
				numberOfStudents--;
			}					
		}		
	}
	
	public String getCourseName()
	{
		return courseName;
	}
	
	public String[] getStudents()
	{
		return students;
	}
	
	public int getNumberOfStudents()
	{
		return numberOfStudents;
	}
	
	/** Deep copy for the students field */
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		Course course = (Course)super.clone();
		course.students = (String[])students.clone();
		return course;
	}
}
