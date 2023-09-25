package iannotationlistener1;

import org.testng.annotations.Test;

import adv.DataProviderSets;

public class TransformerExample {

	/**
	 * based on method name we are passing data from data provider
	 */
	@Test(dataProvider = "iannotation1",dataProviderClass=DataProviderFactory1.class)
	public void t1(String data) {
		System.out.println("Test 1: "+ data);
	}

	/**
	 * t2 is set enabled=false on run time using listeners
	 */
	@Test
	public void t2() {
		System.out.println("Test 2");
	}
	
	@Test
	public void t3() {
		System.out.println("Test 3:");
	}
	
	
	
}
