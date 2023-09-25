package basics;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;
/*
 * test 2 will run at the end after @AfterGroup run  
 */
public class test8_GroupDependency {

	@BeforeGroups("mango")
	public void beforegroup() {
		System.out.println("Run me before mango groups ........");
	}

	@Test(groups = "mango")
	public void test1() {
		System.out.println("one");
	}

	@Test(dependsOnGroups = { "mango" })
	public void test2() {
		System.out.println("two - depends on mango group");
	}

	@AfterGroups("mango")
	public void aftergroup() {
		System.out.println("Run me after mango groups ........");
	}

}

//Run me before mango groups ........
//one
//Run me after mango groups ........

//two - depends on mango group