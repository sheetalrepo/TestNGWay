package adv;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test1_dataprovider {

	
	/**
	 * This test is consuming data from "simple_array" data provider
	 */
	@Test(dataProvider = "simple_array",dataProviderClass=DataProviderSets.class)
	public void test(int number, int expected) {
		Assert.assertEquals(number + 10, expected);
	}
	
	
	
	
	/**
	 * "multi_data_provider" provides two type of data depending upon test case method name
	 */

	@Test(dataProvider = "multi_data_provider",dataProviderClass=DataProviderSets.class)
	public void multicase1(int number, int expected) {
		Assert.assertEquals(number, expected);
	}

	@Test(dataProvider = "multi_data_provider",dataProviderClass=DataProviderSets.class)
	public void multicase2(String email, String expected) {
		Assert.assertEquals(email, expected);
	}
}
