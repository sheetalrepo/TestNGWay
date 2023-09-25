package parallel;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SimpleTestCase3 {

	WebDriver driver;

	@Parameters({ "browser" })
	@BeforeTest
	public void setup(String browser) {
		if (browser.equals("firefox")) {
			driver = MyDriverRepo.FIREFOX.getDriver();
		} else {
			driver = MyDriverRepo.CHROME.getDriver();
		}
	}

	@Test
	public void openGoogle() {
		driver.get("https://www.google.co.in/");
		String title = driver.getTitle();
		System.out.println("Google title:::" + title);
	}

	//@Test
	public void openYahoo() {
		driver.get("https://in.yahoo.com/");
		String title = driver.getTitle();
		System.out.println("Yahoo title:::" + title);
	}

	@AfterTest
	public void tearDown() {
		System.out.println("..... driver about to quit");
		driver.quit();
	}

}
