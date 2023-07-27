package inheritance;
import java.util.Scanner;


class person
{
	protected int age;
	protected String name;
	protected int num;
	
   person(int age,String name,int num)
   {
   this.age=age;
   this.name=name;
   this.num=num;
   }
}

interface inter1
{
	void display();
}

interface inter2
{
	void display();
}

class staff extends person implements inter1,inter2
{
	protected String des;
	protected int salary;

staff(int age,String name,int num,String des,int salary)
{
	super(age,name,num);
	this.des=des;
	this.salary=salary;
}
public void display()
{
System.out.println("age="+this.age+"name="+this.name+"num="+this.num+"des="+this.des+"salary="+this.salary);
}

public void m()
{
	double hike=1.5*this.salary;
	System.out.println(hike);
}
}

public class Singleinheritance {
	
	public static void main(String[] args) {
		
		staff em=new staff(14,"vj",232313,"pro",15000);
		em.display();
		em.m();
		
		}

	}


