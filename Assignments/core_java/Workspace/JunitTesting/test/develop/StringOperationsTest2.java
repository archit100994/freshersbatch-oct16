package develop;

import org.junit.Assert;
import org.junit.Test;

public class StringOperationsTest2 {

	StringOperations stringOperations = new StringOperations();
	String str="Helloworld";
	@Test
	public void testGetCharacter() {
		Assert.assertEquals('o', stringOperations.getCharacter(4));
	}
}
