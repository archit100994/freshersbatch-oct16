package oct20;
import java.lang.reflect.*;

class Sample
{
	String name;
	int age;
	
	/*public String toString()
	{
		return 
	}*/
	
	@Getter
	public void getName()
	{
		System.out.println("Name");
	}
	
	@Getter
	public void getAge()
	{
		System.out.println("Age");
	}
	
	@Getter
	public void getDoB()
	{
		System.out.println("DoB");
	}
	
	public void getArea()
	{
		System.out.println("Area");
	}
}


public class GetterMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Class sam = Class.forName("oct20.Sample");
		Method [] methods = sam.getDeclaredMethods();
		Field[] f= sam.getDeclaredFields();
		
		for(Method method : methods)
		{
			Getter gett = method.getAnnotation(Getter.class);
	            if (gett != null)
	            {
	                try
	                {
	                    String s= method.getName().replace("get", "");
	                    boolean flag = false;
	                    for(Field fi : f)
	                    	if(s.equalsIgnoreCase(fi.getName())) 
	                    		flag = true;
	                    if(!flag)
	                    	System.out.println("Method \""+method.getName()+"\" is Annotated by Getter but not correct.");
	                    else
	                    	System.out.println("Method \""+method.getName()+"\" is Annotated by Getter and is correct.");
	                	
	                	//method.invoke(sam);
	                }
	                catch (Exception e)
	                {
	                    e.printStackTrace();
	                }
	            }
	            else
	            {
	            	System.out.println("Method \""+method.getName()+"\" is not Annotated by Getter.");
	            }
	      }
	}
}