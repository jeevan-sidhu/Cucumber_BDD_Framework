package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookPage {
	private WebDriver driver;
	private By forgotPwdLink = By.xpath("//a[contains(text(),\"Forgot\")]");
	
	public FacebookPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public Boolean verifyForgotPwdLink() {
		return driver.findElement(forgotPwdLink).isDisplayed();
	}
	
	public String getTitle() {
		return driver.getTitle();
	}

}
