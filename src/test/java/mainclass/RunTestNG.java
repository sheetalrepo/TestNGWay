package mainclass;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

/**
 * Running testng.xml from main command
 * 
 * Using this testng project can be run using a jar file
 */
public class RunTestNG {

	public static void main(String[] args) {

		System.out.println("*** I am into main method");
		
		// Create object of TestNG Class
		TestNG runner = new TestNG();
		
		// Create a list of String
		List<String> suitefiles = new ArrayList<String>();

		// Add xml file which you have to execute
		suitefiles.add("/Users/sheetalsingh/Documents/testngmain/testng.xml");
		
		// now set xml file for execution
		runner.setTestSuites(suitefiles);

		// finally execute the runner using run method
		runner.run();
		System.out.println("*** main method finished");
	}

}
