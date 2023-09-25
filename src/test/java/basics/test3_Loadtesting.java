package basics;

import org.testng.annotations.Test;
/*
 * Loadtesting: same test can be run multiple time and total time etc can be checked
 */
public class test3_Loadtesting {
	
	/**
	 * This method will be executed 5 times by same thread
	 */
	@Test(invocationCount = 5)
	public void test1() {
		System.out.println("Hi: " + Thread.currentThread().getId());
	}

	
	
	/**
	 * This method will be executed total 5 times but by 3 different threads
	 */
	@Test(invocationCount = 5, threadPoolSize = 3)
	public void test2() {
		System.out.println("multithreading: "
				+ Thread.currentThread().getId());
	}
}

