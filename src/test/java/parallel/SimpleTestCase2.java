package parallel;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SimpleTestCase2 {

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
	public void openYahoo() {
		driver.get("https://in.yahoo.com/");
		String title = driver.getTitle();
		System.out.println("Yahoo title:" + title);
	}

	@AfterClass
	public void tearDown() {
		System.out.println("..... Yahoo about to quit");
		driver.quit();
	}

}
