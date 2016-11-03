package develop;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StringOperationsTestCombined {

	StringOperations stringOperations = new StringOperations();
	String str="Helloworld";
	
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("BeforeClass");
	}
	
	@AfterClass
	public static void afterClass()
	{
		System.out.println("After Class");
	}
	
	@Before
	public void before()
	{
		System.out.println("\t\tBefore");
	}
	@After
	public void after()
	{
		System.out.println("\t\tafter");
	}
	
	@Test
	public void testConcat() {
		Assert.assertEquals(str, stringOperations.Concat("Hello", "world"));
	}

	@Test
	public void testGetCharacter() {
		Assert.assertEquals('o', stringOperations.getCharacter(4));
	}

	@Test
	public void testGetLength() {
		Assert.assertEquals(10, stringOperations.getLength());
	}

}
