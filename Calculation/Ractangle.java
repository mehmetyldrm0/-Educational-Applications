package Calculation;

public class Ractangle   {
	double width;
	double height;
	
	public Ractangle(double width, double height)
	{
		this.width = width;
		this.height = height;
	}
	
	public Ractangle()
	{
		this(1, 1);
	}
	
	public double getArea()
	{
		return (width * height);
	}
	
}
