package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GooglePage {
	private WebDriver driver;
	private By searchBox = By.name("q");
	
	public GooglePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getTitle() {
		System.out.println(driver.getTitle());
		return driver.getTitle();
	}
	
	public void search(String txt) {
		driver.findElement(searchBox).sendKeys(txt,Keys.ENTER);
	}

}
