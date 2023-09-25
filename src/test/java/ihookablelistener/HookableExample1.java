package ihookablelistener;

import org.testng.IHookCallBack;
import org.testng.IHookable;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Based on DP values we skip the test and set some random attribute like 'disabled'
 * Later in Listeners we fetch all skipped test, 
 * on iteration we removed all test from report which are having above set attribute
 *
 * IMP: This is used so that skipped test cases based on some condition should not be part of testng report 	
 *	this will work only if we run test using maven command
 *	For this we given testng.xml path in pom and running using mvn clean install
 */
public class HookableExample1 {

	
	@Test(dataProvider = "getDp",dataProviderClass=DP1.class)
	public void abc(String p) {
		System.out.println("***************** Data Values: " + p);
	}

	

}
