package A_DemoTestNG;

import org.testng.Assert;
import org.testng.annotations.*;

/*
 * Order :  STC GM  :  BSuite BTest BClass BGroup BMethods
 * Before and After Method run before and after every @test cases. so it runs multiple times
 * TestNG has some extra feature which JUnit don't have - BeforeSuite, BeforeTest and BeforeGroup
 * 
 * nice article on testng: http://www.mkyong.com/tutorials/testng-tutorials/
 * 
 * 
 * mvn clean test -DsuiteXmlFile="demo.xml"
 */
public class test1_AnnotationsBasics {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("----------Before Suite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("-------Before Test");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("----Before Class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("--Before Method");
	}

	@Test
	public void test1() {
		System.out.println("test 1");
		Assert.assertTrue(1==1);
	}

	@Test
	public void test2() {
		System.out.println("test 2");
		Assert.assertTrue( 1==1, "Condition failed");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("--After Method");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("----After Class");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("-------After Test");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("----------After Suite");
	}

}
