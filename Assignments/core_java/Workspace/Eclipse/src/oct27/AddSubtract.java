package oct27;
import java.util.function.*;
interface myInterface
{
	int Test(int a, int b);
}

public class AddSubtract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		myInterface addition = (int a, int b) -> a+b;
		System.out.println(addition.Test(10, 5));
		
		myInterface subtract = (int a, int b) -> a-b;
		System.out.println(subtract.Test(10, 5));
		
		myInterface Multi = (int a, int b) -> a*b;
		System.out.println(Multi.Test(10, 5));
		
		myInterface divide = (int a, int b) -> a/b;
		System.out.println(divide.Test(10, 5));
	}

}
