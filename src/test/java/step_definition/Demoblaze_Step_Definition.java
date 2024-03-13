package step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Demoblaze_Step_Definition {
	WebDriver driver;
	@Given("User must be on homepage url {string}")
	public void user_must_be_on_homepage_url(String string) {
	    System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
	    driver = new FirefoxDriver();
	    driver.get(string);
	}

	@When("User clicks on sign-up button")
	public void user_clicks_on_sign_up_button() {
	    driver.findElement(By.id("signin2")).click();
	}

	@Then("Sign-up dialog box should be displayed")
	public void sign_up_dialog_box_should_be_displayed() {
		boolean actual = driver.findElement(By.cssSelector("#signInModal > div > div > div.modal-body")).isDisplayed();
		Assert.assertEquals(true,actual);
		driver.close();
	}
}
