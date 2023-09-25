package basics;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class test9_Parameters {

	@Test
	@Parameters({ "dbconfig", "poolsize" })
	public void test1(String dbc, String ps) {
		System.out.println("DB Config: " + dbc);
		System.out.println("Pool Size: " + ps);
	}


	@Test
	@Parameters({ "poolsize" })
	public void test1(String ps) {
		System.out.println("Pool Size: " + ps);
	}



}

