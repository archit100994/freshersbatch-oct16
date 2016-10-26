package oct26Collections;

import java.util.*;

public class ArrayListReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> arylst= new ArrayList<Integer>();
		
		arylst.add(10);
		arylst.add(12);
		arylst.add(19);
		arylst.add(11);
		arylst.add(15);
		arylst.add(13);
		arylst.add(18);
		arylst.add(16);
		
		//Iterator<Integer> itr= arylst.iterator();
		ListIterator<Integer> litr= arylst.listIterator();
		
		while(litr.hasNext()) {
			Integer key = litr.next();
			System.out.println(key);
		}
		System.out.println("\n");
		
		while(litr.hasPrevious()) {
			Integer key = litr.previous();
			System.out.println(key);
		}
		System.out.println("\n");
		
	}

}
