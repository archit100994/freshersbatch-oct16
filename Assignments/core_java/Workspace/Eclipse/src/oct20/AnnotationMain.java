package oct20;

class Archit
{
	@Deprecated
	public void getFirstName()
	{
		System.out.println("Archit");
	}

	
	public void getName()
	{
		System.out.println("Archit");
	}
}

class Toshi extends Archit
{
	@Override
	public void getName()
	{
		System.out.println("Toshi");
	}
}


public class AnnotationMain {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toshi a= new Toshi();
		a.getFirstName();
		a.getName();
	}

}
