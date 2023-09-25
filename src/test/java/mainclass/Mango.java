package mainclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Mango {

	WebDriver driver;
	
	
	@BeforeClass
	public void setup(){
		driver = DriverFactory.createInstance("firefox");
	}
	
	@AfterClass
	public void teardown(){
		driver.quit();
	}
	
	@Test
	public void m_one() throws InterruptedException{
		System.out.println("*** test 1");
		driver.get("https://www.google.co.in/?gfe_rd=cr&ei=NQoMWbfFOsaT8Qfl8qigCQ");
		driver.findElement(By.id("gs_htif0")).sendKeys("Google case");
		driver.findElement(By.id("_fZl")).click();
		Thread.sleep(2000);
		Assert.assertTrue(true);
	}
	
	
	@Test
	public void m_two() throws InterruptedException{
		System.out.println("*** test 2");
		driver.get("https://www.bing.com/");
		driver.findElement(By.id("sb_form_q")).sendKeys("Bing case");
		driver.findElement(By.id("sb_form_go")).click();
		Thread.sleep(2000);
	}
	
}
