package basics;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
 * TestNG can catch expected exception and that case will be treated as Pass
 */
public class test4_ExceptionHandling {

	
	/**
	 * This case will fail as we will get exception
	 */
	@Test
	public void test1() {
		int i = 1 / 0;
	}
	
	
	/**
	 * This case will pass as we have handled exception
	 */
	@Test(expectedExceptions = ArithmeticException.class)
	public void test2() {
		int i = 1 / 0;
	}

	
}
