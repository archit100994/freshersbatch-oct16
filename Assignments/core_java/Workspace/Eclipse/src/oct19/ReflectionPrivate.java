package oct19;

import java.lang.reflect.Field;

class AbcSample{
	private int x = 10;
}

public class ReflectionPrivate {

	public static void main(String args[]) throws ClassNotFoundException{
		Class c = Class.forName("oct19.AbcSample");
		Field f[] = c.getDeclaredFields();
		for(Field ff : f){
			System.out.println(ff.getName());
		}
	}
	
}
