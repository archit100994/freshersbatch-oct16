package oct27;

class Mywrapper<T>
{
	T t;
	public Mywrapper()
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


public class GenericsA1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mywrapper m= new Mywrapper();
		m.setT("Archit");
		System.out.println(""+m.getT());
		
		m.setT(123);
		System.out.println(""+m.getT());
		
	}
}
