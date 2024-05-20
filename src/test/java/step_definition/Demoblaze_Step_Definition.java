package step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import driverManager.CreateDriverSingleton;
//import static hooks.Hooks.driver;
//import driverManager.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Demoblaze_Step_Definition {
	WebDriver driver;
	
	public Demoblaze_Step_Definition() {
		driver = CreateDriverSingleton.getInstance().getDriver();
//		driver = DriverFactory.getDriver();
	}
	
	@Given("User must be on homepage url {string}")
	public void user_must_be_on_homepage_url(String string) {
	    driver.get(string);
	}

	@When("User clicks on sign-up button")
	public void user_clicks_on_sign_up_button() throws InterruptedException {
	    driver.findElement(By.id("signin2")).click();
	    Thread.sleep(2000);
	}

	@Then("Sign-up dialog box should be displayed")
	public void sign_up_dialog_box_should_be_displayed() {
		boolean actual = driver.findElement(By.cssSelector("#signInModal > div > div > div.modal-body")).isDisplayed();
		Assert.assertEquals(false,actual);
	}
}
