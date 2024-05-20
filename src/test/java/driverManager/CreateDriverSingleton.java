package driverManager;

import org.openqa.selenium.WebDriver;

public class CreateDriverSingleton {
//	private WebDriver driver;
	private ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	private static CreateDriverSingleton Instance;
	
	private CreateDriverSingleton() {
		
	}
	
	public static synchronized CreateDriverSingleton getInstance(){
		if (Instance==null) {
			Instance = new CreateDriverSingleton();
		}	
		return Instance;
	}
	
	
	public void setDriver(String browser) {
//		driver = DriverManager.getBrowserManager(browser).getDriver();
		driver.set(DriverManager.getBrowserManager(browser).getDriver());
	}
	
	public WebDriver getDriver() {
		return driver.get();
	}
	
	public void closeDriver() {
		driver=null;
	}
	
	
	

}
