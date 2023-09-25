package mainclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Orange {

	WebDriver driver;

	@BeforeClass
	public void setup() {
		driver = DriverFactory.createInstance("firefox");
	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}

	@Test
	public void o_one() throws InterruptedException {
		System.out.println("*** test 3");
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		driver.findElement(By.id("searchInput")).sendKeys("Wiki");
		Thread.sleep(3000);
	}

	@Test
	public void o_two() throws InterruptedException {
		System.out.println("*** test 4");
		driver.get("https://github.com/");
		driver.findElement(By.id("user[login]")).sendKeys("Github");
		Thread.sleep(3000);
	}

}
