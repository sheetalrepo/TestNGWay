package A_DemoTestNG;

import org.testng.annotations.Test;

/**
 * We can enable and disable test using true/false
 * 
 */
public class test5_IgnoreTest {

	@Test
	public void test1() {
		System.out.println("test1");
	}
	
	
	@Test(enabled = true)
	public void test2() {
		System.out.println("test2");
	}
	
	
	/**
	 * This case will not run as we have disabled it
	 */
	@Test(enabled = false)
	public void test3() {
		System.out.println("test3: will not print");
	}

}
