package A_DemoTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test8_dataprovider {

	
	/**
	 * This test is consuming data from "simple_array" data provider
	 */
	@Test(dataProvider = "simple_array",dataProviderClass= DataProviderSets.class)
	public void test(int number, int expected) {
		System.out.println(number);
		System.out.println(expected);
		System.out.println();
		Assert.assertEquals(number + 10, expected);
	}

}
