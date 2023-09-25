package iannotationlistener1;

import java.lang.reflect.Method;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

public class DataProviderFactory1 {

	
	/**
	 * sending single values
	 */
	@DataProvider(name = "dataprovider1")
	public Object[][] provideData() {
		return new Object[][] { {"jan"},{"feb"},{"mar"} };
	}

	
	
}
