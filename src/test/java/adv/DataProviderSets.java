package adv;

import java.lang.reflect.Method;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

public class DataProviderSets {

	
	/**
	 * This is generating data i.e. providing data to any test which ask for it
	 */
	@DataProvider(name = "simple_array")
	public Object[][] provideData() {
		return new Object[][] { { 10, 20 }, { 100, 110 }, { 200, 210 } };
	}

	
	
	
	
	
	/**
	 * Generating two type of data - int and strings lists depending upon test name
	 */
	@DataProvider(name = "multi_data_provider")
	public Object[][] provideData(Method method) {

		Object[][] result = null;

		if (method.getName().equals("multicase1")) {
			result = new Object[][] { { 1, 1 }, { 200, 200 } };
		} else if (method.getName().equals("multicase2")) {
			result = new Object[][] { { "test@gmail.com", "test@gmail.com" },
					{ "test@yahoo.com", "test@yahoo.com" } };
		}
		return result;
	}
	
	
	
	
	
	
	
	
	
}
