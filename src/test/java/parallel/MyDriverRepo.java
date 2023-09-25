package parallel;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
 * earlier used when thread local has not been implemented
 * 
 * currently not in use
 */
public enum MyDriverRepo {

	FIREFOX {
		public WebDriver getDriver() {
			String current_os = System.getProperty("os.name");
			if (current_os.equals("Mac OS X")) {
				String path = System.getProperty("user.dir");
				System.setProperty("webdriver.gecko.driver", path + "/src/test/resources/drivers/geckodriver");
			} else if (current_os.equals("Windows")) {
				System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
			} else {
			}
			return new FirefoxDriver();
		}

	},
	CHROME {
		public WebDriver getDriver() {
			String current_os = System.getProperty("os.name");

			if (current_os.equals("Mac OS X")) {
				String path = System.getProperty("user.dir");
				System.setProperty("webdriver.chrome.driver", path + "/src/test/resources/drivers/chromedriver3");
				return new ChromeDriver();
			} else if (current_os.equals("Window")) {
				System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
			} else {
			}
			return new ChromeDriver();
		}
	};

	WebDriver driver;

	MyDriverRepo(WebDriver drv) {
		this.driver = drv;
	}

	MyDriverRepo() {
	}

	public WebDriver getDriver() {
		return driver;
	}

}
