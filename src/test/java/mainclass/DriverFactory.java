package mainclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	
	public static WebDriver createInstance(String browserName) {
		WebDriver driver = null;
		if (browserName.toLowerCase().contains("firefox")) {
			
			String current_os = System.getProperty("os.name");
			if (current_os.equals("Mac OS X")) {
				System.out.println("*** get mac driver");
				String path = System.getProperty("user.dir");
				//System.setProperty("webdriver.gecko.driver", path + "/src/test/resources/drivers/geckodriver");
				System.setProperty("webdriver.gecko.driver", "/Users/sheetalsingh/Documents/testngmain/geckodriver");
			} else if (current_os.equals("Windows")) {
				System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
			} else {
			}
			return new FirefoxDriver();
		}else if(browserName.toLowerCase().contains("chrome")){
			String path = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path + "/src/test/resources/drivers/chromedriver3");
			return new ChromeDriver();
		}else{
		}

		return driver;

	}
}
