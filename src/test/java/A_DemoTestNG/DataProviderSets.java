package A_DemoTestNG;

import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

public class DataProviderSets {

	
	/**
	 * This is generating data i.e. providing data to any test which ask for it
	 */
	@DataProvider(name = "simple_array")
	public Object[][] provideData() {
		return new Object[][] { 
				{ 10, 20 }, 
				{ 100, 110 }, 
				{ 200, 210 } 
		};
	}

	
}
