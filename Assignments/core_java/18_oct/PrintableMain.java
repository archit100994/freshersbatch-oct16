interface Printable
{
	String print();
}

class Employee implements Printable
{
	public String print()
	{
		return "Employee";
	}
}

class Circle implements Printable
{
	public String print()
	{
		return "Circle";
	}
}

public class PrintableMain
{
	public static void main(String args[])
	{
		Printable p[] = new Printable[2];
		
		p[0]= new Employee();
		p[1]= new Circle();
		
		printAll(p);
	}	
		
	static void printAll(Printable p[])
	{
		for(int i=0; i<p.length; i++)
		{
			System.out.println("The output is: " + p[i].print());
		}
	}
}