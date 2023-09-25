package basics;

import org.testng.Assert;
import org.testng.annotations.Test;

//@Test(groups="deploy")    //this way all test under this class will come under 'deploy' group
public class test6_DependsOn {

	/**
	 * Test B will always run after Test A, as B depends on A
	 */
	@Test
	public void testA() {
		System.out.println("Test A");
		Assert.assertEquals(true, true);
	}

	@Test(dependsOnMethods = { "testA" })
	public void testB() {
		System.out.println("Test B");
	}

	
	
	/**
	 * Test D will be skipped as Test C failed
	 */
	
	@Test
	public void testC() {
		System.out.println("Test C");
		Assert.assertEquals(true, false);
	}

	@Test(dependsOnMethods = { "testC" })
	public void testD() {
		System.out.println("Test D");
	}

	
	
}

