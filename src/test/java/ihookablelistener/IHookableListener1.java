package ihookablelistener;

import org.testng.IHookCallBack;
import org.testng.IHookable;
import org.testng.ITestResult;
import org.testng.SkipException;

public class IHookableListener1 implements IHookable {

	
	@Override
	public void run(IHookCallBack callBack, ITestResult testResult) {
		Object[] parms = callBack.getParameters();
		if (parms[0].equals("dummy")) {
			testResult.setAttribute("disabled", true);
			throw new SkipException("skipping test");
		} else {
			callBack.runTestMethod(testResult);
		}
	}

	

}
