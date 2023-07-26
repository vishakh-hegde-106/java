package triangle;

public class triangle
{
	protected double height;
	protected double base;
	public triangle(double height,double base)
	{
		this.height=height;
		this.base=base;
	}
	public double area()
	{
		double area=0.5*this.height*this.base;
		return area;
	}
}

