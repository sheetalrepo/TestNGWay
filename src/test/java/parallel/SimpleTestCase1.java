package parallel;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SimpleTestCase1 {

	WebDriver driver;

	@Parameters({ "browser" })
	@BeforeClass
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
		System.out.println("Google title:" + title);
	}

	@AfterClass
	public void tearDown() {
		System.out.println("..... Google about to quit");
		driver.quit();
	}

}
