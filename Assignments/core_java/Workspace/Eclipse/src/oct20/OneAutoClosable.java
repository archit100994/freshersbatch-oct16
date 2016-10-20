package oct20;

interface AutoClosable
{
	public void close() throws Exception;
}

class MyAutoClosable implements AutoCloseable
{
	@Override
	public void close() throws Exception {
		System.out.println("MyAutoClosable closed!");
	}
	public void throwException() throws Exception{
		throw new Exception();
	}
}

public class OneAutoClosable {

	public static void main(String[] args) {
		
		try(MyAutoClosable m = new MyAutoClosable()){
			//m.throwException();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
