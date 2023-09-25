package ihookablelistener;
import org.testng.IHookCallBack;
import org.testng.IHookable;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.Iterator;

/**
 * Same example just added all listeners in one class 
 * Not a good way :(
 *
 */

@Listeners(HookableExample2.Listener.class)
public class HookableExample2 implements IHookable {
  
	@Override
    public void run(IHookCallBack callBack, ITestResult testResult) {
        String parameter = (String) callBack.getParameters()[0];
        if (! "junit".equalsIgnoreCase(parameter)) {
            callBack.runTestMethod(testResult);
        } else {
        	System.out.println("****************** wow");
            testResult.setAttribute("disabled", true);
            throw new SkipException("Skipping ");
        }
    }
    
    
    @DataProvider(name = "dp")
    public Object[][] getData() {
        return new Object[][] {
            {"junit"},{"testng"},{"junit"},{"junit"}
        };
    }
    
    @Test(dataProvider = "dp")
    public void testMethod(String name) {
        System.err.println("Incoming parameter was " + name);
    }

    
    
    

    public static class Listener implements ITestListener {

        @Override
        public void onTestStart(ITestResult result) {

        }

        @Override
        public void onTestSuccess(ITestResult result) {

        }

        @Override
        public void onTestFailure(ITestResult result) {

        }

        @Override
        public void onTestSkipped(ITestResult result) {
        	
        }

        @Override
        public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

        }

        @Override
        public void onStart(ITestContext context) {

        }

        @Override
        public void onFinish(ITestContext context) {
            Iterator<ITestResult> iterator = context.getSkippedTests().getAllResults().iterator();
            while (iterator.hasNext()) {
                ITestResult result = iterator.next();
                if (Boolean.parseBoolean(result.getAttribute("disabled").toString())) {
                	iterator.remove();
                }
            }
        }
    }
}