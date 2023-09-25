package ihookablelistener;

import org.testng.IHookCallBack;
import org.testng.IHookable;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;

public class DP1 {

	
	/**
	 * If DP name is not mentioned then direct method name can be used as name
	 */
	@DataProvider
	public Object[][] getDp() {
		return new Object[][] { { "clientX" }, { "dummy" }, { "clientY" } };
	}
	
}
