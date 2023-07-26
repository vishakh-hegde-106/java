package shapes;

import java.util.Scanner;

import circles.circle;
import square.main;
import triangle.triangle;

public class maincls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch=0;
		Scanner s=new Scanner(System.in);
		while (true)
		{
			System.out.println("enter the choice 1.square 2.circle 3.triangle");
			ch = s.nextInt();
		if(ch==1)
		{
			System.out.println("enter side for square");
			Scanner a=new Scanner(System.in);
			int side=a.nextInt();
			main sq=new main(side);
			System.out.println("area of square"+sq.area());
		
		}
		else if(ch==2)
		{
			
			System.out.println("enter radius for circle");
			Scanner b=new Scanner(System.in);
			int radius=b.nextInt();
			circle r=new circle(radius);
			System.out.println("area of circle"+r.area());
			
		}
		else if(ch==3)
		{
			
			System.out.println("enter side for triangle");
			Scanner c=new Scanner(System.in);
			double side=c.nextDouble();
			
			System.out.println("enter base for triangle");
			Scanner d=new Scanner(System.in);
			double base=d.nextDouble();
			
			triangle tr=new triangle(side,base);
			System.out.println("area of triangle"+tr.area());
			
		}
		else
		{
			System.out.println("enter valid choice");
			break;
			
		}
	}
	}

}
