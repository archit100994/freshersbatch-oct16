package develop;

import org.junit.Assert;
import org.junit.Test;

public class StringOperationsTest3 {

	StringOperations stringOperations = new StringOperations();
	String str="Helloworld";
	@Test
	public void testGetLength() {
		Assert.assertEquals(10, stringOperations.getLength());
	}

}
