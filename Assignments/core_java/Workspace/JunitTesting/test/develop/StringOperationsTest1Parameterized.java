package develop;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringOperationsTest1Parameterized {

	StringOperations stringOperations = new StringOperations();
	String str = "Helloworld";

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
	public void testConcat() {
		Assert.assertEquals(s1.concat(s2), stringOperations.Concat(s1, s2));
	}
}
