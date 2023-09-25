package A_DemoTestNG;

import org.testng.annotations.Test;

public class test9_Parallel2 {

	@Test
	public void testX() {
		System.out.println("Parallel Class 2 testX: " + Thread.currentThread().getId());
	}

	@Test
	public void testY() {
		System.out.println("Parallel Class 2 testY: " + Thread.currentThread().getId());
	}

	@Test
	public void testZ() {
		System.out.println("Parallel Class 2 testZ: " + Thread.currentThread().getId());
	}


}
