import java.util.*;

class Person implements Comparable<Person>
{
	String name;
	int height;
	int weight;

	public Person(String name, int height, int weight)
	{
		this.name=name;
		this.height=height;
		this.weight=weight;
	}

	public String getName()
	{
		return this.name;
	}

	public int getHeight()
	{
		return this.height;
	}

	public int getWeight()
	{
		return this.weight;
	}

	public int compareTo(Person p)
	{
		if (p.getHeight()>this.getHeight())
		{
			return 1;
		}
		else if (p.getHeight()<this.getHeight())
		{
			return -1;
		}
		else
			return 0;
	}

	public String toString()
	{
		return this.name + ", "+ this.height  + ", " + this.weight;
	}

}

/*class PersonNameComparator
{
	public int compare(Person p1, Person p2)
	{
		if (p1.getName()>p2.getName())
		{
			return 1;
		}
		else if (p1.getName()<p2.getName())
		{
			return -1;
		}
		else
			return 0;
	}
}*/

class PersonHeightComparator implements Comparator<Person>
{
	public int compare(Person p1, Person p2)
	{
		if (p1.getHeight()>p2.getHeight())
		{
			return 1;
		}
		else if (p1.getHeight()<p2.getHeight())
		{
			return -1;
		}
		else
			return 0;
	}
}

class PersonWeightComparator implements Comparator<Person>
{
	public int compare(Person p1, Person p2)
	{
		if (p1.getWeight()>p2.getWeight())
		{
			return 1;
		}
		else if (p1.getWeight()<p2.getWeight())
		{
			return -1;
		}
		else
			return 0;
	}
}

public class ComparableComparator
{
	public static void main(String[] args)
	{
		List<Person> per = new ArrayList<Person> ();

		Person p1=new Person("Archit", 157, 80);
		Person p2=new Person("Chandan", 150, 65);
		Person p3=new Person("Sushil", 155, 70);

		per.add(p1);
		per.add(p2);
		per.add(p3);

		Collections.sort(per, new PersonHeightComparator());

		for(Person p: per){
			System.out.println(p);
		}
	}
}