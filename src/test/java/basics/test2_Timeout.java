package basics;

import org.testng.annotations.Test;

/**
 * Timeout can be given in TestNG which will make sure test finished within prescribed time
 * else test will fail
 *
 */
public class test2_Timeout {

	/**
	 * This method will fail as we expect it to finished in 5 sec but test took 10sec
	 */
	@Test(timeOut = 5000)  
	public void test1() throws InterruptedException {
		Thread.sleep(10000);
		System.out.println("test1");
	}

	@Test(timeOut = 5000)
	public void test2() throws InterruptedException  {
		Thread.sleep(1000);
		System.out.println("test2");
	}

}
