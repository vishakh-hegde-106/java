package circles;

public class circle
{
	protected int radius;
	public circle(int radius)
	{
		this.radius=radius;
	}
	
	public double area()
	{
	double area=3.14*this.radius*this.radius;
	return area;
	}
}

