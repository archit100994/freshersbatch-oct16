package oct27;

import java.util.ArrayList;
import java.util.List;

public class ListNumbers {

	public static <U extends Number> void print(List<U> u)
	{
		for(Object o: u)
			System.out.println(o);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ls= new ArrayList<Integer>();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(12);
		ls.add(9);
		//ls.add("ABC");
		
		print(ls);

	}

}
