package oct19;
import java.lang.reflect.*;

public class InfoRefl {

	public static void main(String[] args) throws ClassNotFoundException{
		// TODO Auto-generated method stub
		
		Class c= Class.forName(args[0]);
		
		Constructor con[]=c.getDeclaredConstructors();
		Field f[]= c.getDeclaredFields();
		Method m[]=c.getDeclaredMethods();
		
		for(int i=0; i<con.length; i++)
		{
			System.out.println(con[i]);
		}
		
		System.out.println("************************************************************");
		
		for(int i=0; i<f.length; i++)
		{
			System.out.println(f[i]);
		}
		
		System.out.println("************************************************************");
		
		for(int i=0; i<m.length; i++)
		{
			System.out.println(m[i]);
		}

		

	}

}
