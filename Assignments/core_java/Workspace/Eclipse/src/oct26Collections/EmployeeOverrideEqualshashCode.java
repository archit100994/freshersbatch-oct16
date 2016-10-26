package oct26Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Employee{
	private int id;
	private String name;
	private int salary;
	
	public Employee(int id, String name, int salary){
		this.id=id;
		this.name = name;
		this.salary = salary;
	}
	
	public double getsalary(){
		return this.salary;
	}
	
	public String toString()
	{
		return (""+this.hashCode());
		//return null;
	}
	
	@Override
	public int hashCode()
	{
		//int ans=this.id*this.salary;
		return 1000;
		
	}
	@Override
	public boolean equals(Object d)
	{
		if((this.id==((Employee)d).id) && (this.salary==((Employee)d).salary))
			return true;
		else
			return true;
	}
	
}

public class EmployeeOverrideEqualshashCode {
	public static void main(String[] args) {
		
		Map<Employee, String> hmap = new HashMap<Employee, String>();
		Employee d1=new Employee(10, "ananan", 1994);
		Employee d2=new Employee(10, "sdsdsd", 1999);
		hmap.put(d1, "Archit");
		hmap.put(d2, "Toshi");
		
		Iterator<Employee> itr = hmap.keySet().iterator();		
		while(itr.hasNext()) {
			Employee key = itr.next();
			System.out.println(hmap.get(key));
		}

		//System.out.println(hmap.get(d1));
		
	}

}
