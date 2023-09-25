package basics;

import org.testng.annotations.Test;

/**
 * 1. Default Priority: Alphabetically
 * 
 *
 */
public class PriorityA {

	
	@Test(priority = 1, groups = { "PA" })
	//@Test
	public void one() {
		System.out.println("A1");
	}
	
	@Test(priority = 2, groups = { "PA" })
	//@Test
	public void two() {
		System.out.println("A2");
	}
	
	@Test(priority = 3, groups = { "PA" })
	//@Test
	public void three() {
		System.out.println("A3");
	}
}
