package develop;

import org.junit.Assert;
import org.junit.Test;

public class StringOperationsTest1 {

	StringOperations stringOperations = new StringOperations();
	String str="Helloworld";
	@Test
	public void testConcat() {
		Assert.assertEquals(str, stringOperations.Concat("Hello", "world"));
	}
}
