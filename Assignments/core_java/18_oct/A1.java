//class Abst							***Not Working***

//abstract private class Abst			***private modifier not allowed here

//abstract final class Abst				***Cannot inherit from final Abst

abstract class Abst
{
	abstract void custom();				//***We can declare a class abstract without having any abstract method
	
	public void hello()
	{
		System.out.print("Hello there!!!!");
	}
}

class Test extends Abst
{
	void custom()						//***Without it the program shows error
	{
		
	}
	
	public Test()
	{
		super.hello();
	}
}

public class A1
{
	public static void main(String args[])
	{
		//Abst a = new Abst();			//***Cannot be instatiated error
		Test t = new Test();
		
	}
}