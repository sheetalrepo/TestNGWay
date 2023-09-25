package basics;

import org.testng.annotations.Test;

public class PriorityB {
	
	@Test(priority = 1, groups = { "PB" })
	//@Test
	public void jan() {
		System.out.println("B1");
	}
	
	@Test(priority = 2, groups = { "PB" })
	//@Test
	public void feb() {
		System.out.println("B2");
	}
	
	@Test(priority = 3, groups = { "PB" })
	//@Test
	public void mar() {
		System.out.println("B3");
	}
}
