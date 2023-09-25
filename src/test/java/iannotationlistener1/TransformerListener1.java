package iannotationlistener1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.DataProvider;
import org.testng.annotations.ITestAnnotation;

/**
 * 
 * Test can be enabled / disabled at run time
 * ref: https://examples.javacodegeeks.com/enterprise-java/testng/testng-listeners-example/
 * @author sheetalsingh
 */
public class TransformerListener1 implements IAnnotationTransformer {

	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
	
		
		if(testMethod.getName().equals("t1")){
			annotation.setDataProviderClass(DataProviderFactory1.class);
			annotation.setDataProvider("dataprovider1");
		}else if (testMethod.getName().equals("t2")) {
			annotation.setEnabled(false);
		}
		
	}

}
