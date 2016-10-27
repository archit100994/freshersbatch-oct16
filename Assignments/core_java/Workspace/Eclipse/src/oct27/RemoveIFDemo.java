package oct27;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIFDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list=  new ArrayList<> ();
		list.add("White");  
	    list.add("Black");  
	    list.add("Red");  
	    list.add("archit");  
	    list.add("Yellow");  
	    list.add("Shrey");  
		
	    Predicate<String> filter = (String s) -> s.length()%2!=0;
	    print(list);
		System.out.println("\nAfter filtering strings with odd lengths :\n ");
		list.removeIf(filter);
		print(list);
	
		
	}
	private static void print(List<String> list) {
		for(String s : list)
			System.out.println(s);
	}

}
