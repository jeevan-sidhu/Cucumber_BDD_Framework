package hooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import driverManager.CreateDriverSingleton;
//import driverManager.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.ConfigReader;

public class Hooks {
	private WebDriver driver;
	private ConfigReader cr;
	Properties prop;
	
	@Before(order=0)
	public void get_property() {
		cr = new ConfigReader();
		prop = cr.LoadConfig();
	}
	
	@Before(order=1)
	public void launch_browser() {
		CreateDriverSingleton.getInstance().setDriver(prop.getProperty("browser"));
		driver = CreateDriverSingleton.getInstance().getDriver();
//		driver = new DriverFactory().initDriver(browser);
//		driver.manage().window().maximize();
	}
	
	
	@After(order=1)
	public void tear_down(Scenario scenario) {
		if(scenario.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[] source = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(source, "img/png", "screenshot");
			
		}
	}
	
	@After(order=0)
	public void quit_browser(Scenario scenario) {
		driver.close();
		System.out.println(scenario.getStatus());
	}
	

}
