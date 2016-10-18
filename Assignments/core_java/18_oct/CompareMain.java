interface Sortable
{
	public boolean compare(Sortable abc);
}

class Employee implements Sortable
{
	int id;
	public Employee(int id)
	{
		this.id=id;
	}
	
	public boolean compare(Sortable abc)
	{
		if(this.id>((Employee)abc).id)
		{
			return true;
		}
		else
			return false;
	}
	
	public String toString()
	{
		return " " + this.id;
	}
}

class Circle implements Sortable
{
	int id;
	public Circle(int id)
	{
		this.id=id;
	}
	
	public boolean compare(Sortable abc)
	{
		if(this.id>((Circle)abc).id)
			return true;
		else
			return false;
	}
	
	public String toString()
	{
		return " " + this.id;
	}
}

public class CompareMain
{
	public static void main(String args[])
	{
		Sortable e[]= new Sortable[3];
		e[0]= new Employee(20);
		e[1]= new Employee(25);
		e[2]= new Employee(15);
		
		Sortable s[]= new Sortable[3];
		s[0]= new Circle(8);
		s[1]= new Circle(6);
		s[2]= new Circle(9);
		
		sortAll(e);
		sortAll(s);
		
	}
	
	static void sortAll (Sortable s[])
	{
		for(int i=0; i<s.length; i++)
		{
			for(int j=i; j<s.length; j++)
			{
				if(s[i].compare(s[j]))
				{
					Sortable temp;
					temp=s[j];
					s[j]=s[i];
					s[i]=temp;
				}
			}
		}
		
		
		for(int i=0; i<s.length; i++)
		{
			System.out.println(s[i]);
		}
	}
}