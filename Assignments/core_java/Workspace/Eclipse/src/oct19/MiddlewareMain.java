package oct19;

import java.lang.reflect.*;


class Test
{
	public void message(int i)
	{
		System.out.println(""+ i);
	}
}

class Middleware
{
	public Object invokeMethod(String className, String methodName, Class [] paramType, Object paramvalues[]) throws Exception /*ClassNotFoundException*/
	{
		Class c= Class.forName(className);
		Method m= c.getMethod(methodName, paramType);
		return m.invoke(c.newInstance(), paramvalues);
	}

}

public class MiddlewareMain
{
	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		String classname = "oct19.Test";
		String methodname= "message";
		Class paramtypes[]= new Class[1];
		paramtypes[0]= int.class;
		Object paramvalues[]= new Object[1];
		paramvalues[0]=1;
		
		Middleware mm= new Middleware();
		
//		try
//		{
			mm.invokeMethod(classname, methodname, paramtypes, paramvalues);
//		}
//		catch(Exception e)
//		{
//			System.out.println("Error");
//		}
		
		
	}

}
