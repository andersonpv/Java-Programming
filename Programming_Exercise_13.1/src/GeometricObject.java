import java.util.Date;

public abstract class GeometricObject {
	private String color = "white";
	private boolean filled;
	private Date dateCreated;
	
	protected GeometricObject()
	{
		dateCreated = new Date();
	}
	
	protected GeometricObject(String color, boolean filled)
	{
		dateCreated = new Date();
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public boolean isFilled()
	{
		return filled;
	}
	
	public void setFilled(boolean filled)
	{
		this.filled = filled;
	}
	
	public Date getDateCreated()
	{
		return dateCreated;
	}
	
	@Override
	public String toString()
	{
		return "Created on: " + dateCreated + "\ncolor: " + color + "\nfilled: " + filled;
	}
	
	/** Abstract method getArea */
	public abstract double getArea();
	
	/** Abstract method getPerimeter */
	public abstract double getPerimeter();
}
