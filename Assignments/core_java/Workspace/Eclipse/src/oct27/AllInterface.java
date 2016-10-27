package oct27;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.function.Supplier;

public class AllInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Consumer<Integer> consumer =(Integer x)->System.out.println(x);
		printList(Arrays.asList(85,45,90,64,73,81,30,12,44), consumer);
				
		Supplier<Integer> supplier = () ->{ return 75;};
		System.out.println("Result: "+ printGrade(supplier));
		
		Function<Integer, String> function = (Integer marks)->marks > 40 ? "PASS" : "FAILED";
		System.out.println("Result = " + function.apply(45));
		System.out.println("Result = " + function.apply(23));
		
	}

	private static void printList(List<Integer> asList, Consumer<Integer> consumer) {
		// TODO Auto-generated method stub
		for(Integer i: asList)
		{
			consumer.accept(i);
		}
		
	}
	
	public static String printGrade(Supplier<Integer> supplier)
	{
		Integer marks = supplier.get();
		return "A";
	}

}
