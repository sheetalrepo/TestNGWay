package A_DemoTestNG;

import org.testng.annotations.Test;

/*
 * run test9.xml
 */
public class test9_Parallel1 {

	@Test
	public void testA() {
		System.out.println("Parallel Class 1 testA: " + Thread.currentThread().getId());
	}

	@Test
	public void testB() {
		System.out.println("Parallel Class 1 testB: " + Thread.currentThread().getId());
	}

	@Test
	public void testC() {
		System.out.println("Parallel Class 1 testC: " + Thread.currentThread().getId());
	}
	

	

}
