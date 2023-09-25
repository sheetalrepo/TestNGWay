package adv;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import adv.DataProviderSets;

public class test2_groupdataprovider {

	
	/**
	 * Data provider providing data depending upon group name
	 */
	@DataProvider(name = "group_data_provider")
	public Object[][] provideData1(ITestContext context) {

		Object[][] result = null;

		// get test tag name from test2.xml
		System.out.println("TestNG XML Test Name: "+context.getName());

		for (String group : context.getIncludedGroups()) {
			System.out.println("group : " + group);
			if ("groupA".equals(group)) {
				result = new Object[][] { { 1 } };
				break;
			} else if ("groupB".equals(group)) {
				result = new Object[][] { { 2 } };
				break;
			}
		}
		return result;
	}

	
	
	/**
	 * Only test cases from groupA will run as we have specified that in test2.xml
	 */
	@Test(dataProvider = "group_data_provider", groups = { "groupA" })
	public void test1(int number) {
		System.out.println("Test1");
		Assert.assertEquals(number, 1);
	}


	@Test(dataProvider = "group_data_provider", groups = "groupB")
	public void test2(int number) {
		System.out.println("Test2");
		Assert.assertEquals(number, 2);
	}

}