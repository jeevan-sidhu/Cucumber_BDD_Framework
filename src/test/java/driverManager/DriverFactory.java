package driverManager;

import org.openqa.selenium.WebDriver;

import browserManager.ChromeManager;
import browserManager.FirefoxManager;

public class DriverFactory {
	private static WebDriver driver;
	
	public WebDriver initDriver(String browser) {
		switch (browser.toLowerCase()) {
			case "chrome":
				driver = new ChromeManager().getDriver();
				break;
			case "firefox":
				driver = new FirefoxManager().getDriver();
				break;
			default:
				throw new IllegalArgumentException("Browser not available");
		}
		return getDriver();
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

}
