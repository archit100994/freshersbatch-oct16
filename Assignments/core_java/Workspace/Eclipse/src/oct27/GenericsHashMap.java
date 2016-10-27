package oct27;

import java.util.HashMap;
import java.util.Map;

class My<T>
{
	T t;
	public My()
	{
		
	}
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	@Override
	public String toString() {
		return "Mywrapper [t=" + t + ", getT()=" + getT() + "]";
	}
	
	
}

public class GenericsHashMap {

	public static void printMapKeyValues(Map<? extends Number, My> map)
	{
		for(Map map:map)
			{
			map.get(map);
			}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Number, My> hmap= new HashMap<Number, My>();
		My m1= new My();
		m1.setT(123);
		My m2= new My();
		m2.setT("Archit");
		hmap.put(12.56, m1);
		hmap.put(180, m1);
		hmap.put(12345698798l, m2);
		
		printMapKeyValues(hmap);
	}

}
