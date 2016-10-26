package oct26Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetvsLinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> hset = new TreeSet<Integer>();
		hset.add(15);
		hset.add(20);
		hset.add(10);
		hset.add(9);
		hset.add(12);
		hset.add(11);
		hset.add(14);
		Iterator<Integer> itr = hset.iterator();		
		while(itr.hasNext()) {
			Integer key = itr.next();
			System.out.println(key);
		}
		System.out.println("\n");
		
		Set<Integer> lhset = new LinkedHashSet<Integer>();
		lhset.add(15);
		lhset.add(20);
		lhset.add(10);
		lhset.add(9);
		lhset.add(12);
		lhset.add(11);
		lhset.add(14);
		itr = lhset.iterator();		
		while(itr.hasNext()) {
			Integer key = itr.next();
			System.out.println(key);
		}
		System.out.println("\n");

	}

}
