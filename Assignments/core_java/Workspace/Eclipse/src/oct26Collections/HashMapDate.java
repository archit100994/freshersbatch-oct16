package oct26Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


class Date
{
	int date;
	int month;
	int year;
	
	public Date(int date, int month, int year)
	{
		this.date=date;
		this.month=month;
		this.year=year;
		
		//System.out.println(Date.date + ", " + this.month + ", " + this.year);
	}	
	
	@Override
	public int hashCode()
	{
		int ans=this.date*this.month;
		return ans;
		
	}
	@Override
	public boolean equals(Object d)
	{
		if((this.date==((Date)d).date) && (this.month==((Date)d).month))
			return true;
		else
			return false;
	}
	
	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String toString()
	{
		return (""+this.hashCode());
		//return null;
	}
}

public class HashMapDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Date, String> hmap = new HashMap<Date, String>();
		Date d1=new Date(10,9, 1994);
		Date d2=new Date(10, 8, 1999);
		hmap.put(d1, "Archit");
//		hmap.put(new Date(11, 9, 1995), "Avin");
//		hmap.put(new Date(10, 8, 1996), "Shrey");
//		hmap.put(new Date(20, 2, 1996), "Sneha");
//		hmap.put(new Date(23, 4, 1999), "Sarita");
		hmap.put(d2, "Anshika");
//		hmap.put(new Date(6, 7, 1990), "Archana");
		
//		Iterator<Date> itr = hmap.keySet().iterator();		
//		while(itr.hasNext()) {
//			Date key = itr.next();
//			System.out.println(key);
//		}
		System.out.println(hmap.get(d1));
		
	}

}
