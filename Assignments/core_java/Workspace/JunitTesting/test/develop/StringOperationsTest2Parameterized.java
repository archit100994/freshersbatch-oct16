package develop;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

public class StringOperationsTest2Parameterized {

	StringOperations stringOperations = new StringOperations();
	String str="Helloworld";
	
	@Parameter(value = 0)
	public String s1;

	@Parameter(value = 1)
	public String s2;

	@Parameters
	public static Collection<Object[]> data() {
		Object data[][] = { { "Hello", "World" }, { "Archit", "Jain" }, { "Toshi", "Jain" } };
		return Arrays.asList(data);
	}
	@Test
	public void testGetCharacter() {
		Assert.assertEquals(s1.concat(s2).charAt(4), stringOperations.getCharacter(4));
	}
}
