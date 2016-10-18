class Employee implements Cloneable
{
	Date dob;
	
	public Employee(int day, int month, int year)
	{
		this.dob=new Date(day, month, year);
	}
	
	public String toString()
	{
		return this.dob.toString();
	}
	
	public Object clone()throws CloneNotSupportedException
	{  
		return super.clone();
	}
}

class Date implements Cloneable
{
	int day;
	int month;
	int year;
	
	public Date(int day, int month, int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	
	public String toString()
	{
		return this.day + " " + this.month + " " + this.year;
	}
}

public class ShallowDeep
{
	public static void main(String args[])
	{
		Employee e1= new Employee(10, 9, 1994);
		
		System.out.println(e1);
		System.out.println(e1.hashCode());
		
		try
		{
			Employee e2= (Employee)e1.clone();
			
			System.out.println("Shallow cloning");
			System.out.println(e2);
			System.out.println(e2.hashCode());
		}
		
		catch(CloneNotSupportedException c){}
		{
			
		}
	}
}