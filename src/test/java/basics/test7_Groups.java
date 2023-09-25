package basics;

import org.testng.annotations.Test;

/*
 * We can define various group categories and in testng.xml we can decide which group to include and exclude
 * 
 *  <run>
		<include name="group2"/>   includes regA and regB 
		<exclude name="group1"/>   includes sanityA and sanityB
	</run>
 * 
 */
public class test7_Groups {
	
	/**
	 * regA and regB will be run as they are included in <run> tag
	 */
	@Test(groups = { "regA" })
	public void testMethodOne() {
		System.out.println("Test method one - reg A");
	}

	@Test(groups = { "regB" })
	public void testMethodTwo() {
		System.out.println("Test method two  - reg B");
	}

	
	
	/**
	 * sanity A and B will not run as they excluded in <run> tag
	 */
	@Test(groups = { "sanityA" })
	public void testMethodThree() {
		System.out.println("Test method three - san A");
	}

	@Test(groups = { "sanityB" })
	public void testMethodFour() {
		System.out.println("Test method Four - san B");
	}
}
