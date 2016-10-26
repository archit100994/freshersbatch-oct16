package oct26Collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Person implements Comparable<Person>
{
	int height, weight;
	String name;

	public Person(int w, int h, String name)
	{
		this.height=h;
		this.name=name;
		this.weight=w;
	}
	
	public String toString()
	{
		return ("weight: " + weight + " height : " + height + " Name :" + name);
	}

	public int getHeight()
	{
		return this.height;
	}

	public int getWeight()
	{
		return this.weight;
	}
	
	@Override
	public int compareTo(Person p)
	{
		if (p.getWeight()>this.getWeight())
		{
			return 1;
		}
		else if (p.getWeight()<this.getWeight())
		{
			return -1;
		}
		else
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
	}
}


public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Person> tset= new TreeSet<Person>();
		
		tset.add(new Person(80, 150, "Archit"));
		tset.add(new Person(87, 140, "Archit"));
		tset.add(new Person(70, 150, "Archit"));
		tset.add(new Person(63, 160, "Archit"));
		tset.add(new Person(90, 160, "Archit"));
		tset.add(new Person(80, 155, "Archit"));
		tset.add(new Person(90, 100, "Archit"));
		tset.add(new Person(63, 150, "Archit"));
		
		
		Iterator<Person> itr = tset.iterator();		
		while(itr.hasNext()) {
			Person key = itr.next();
			System.out.println(key);
		}
		System.out.println("\n");
		

	}

}
