package step_definition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	WebDriver driver;
	@Given("User must be on page url {string}")
	public void user_must_be_on_page_url(String string) {
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
	    driver = new FirefoxDriver();
	    driver.get(string);
	}

	@When("^User enters valid (.*) and (.*)$")
	public void user_enters_valid_username_and_password(String uname, String pwd) throws InterruptedException {
	    driver.findElement(By.id("username")).sendKeys(uname);
	    driver.findElement(By.id("password")).sendKeys(pwd);
	    Thread.sleep(2000);
	}

	@When("clicks on sign in button")
	public void clicks_on_sign_in_button() {
		driver.findElement(By.id("log-in")).click();
	}

	@Then("User must be logged into his account")
	public void user_must_be_logged_into_his_account() {
	    String actual = driver.getCurrentUrl();
	    Assert.assertEquals("https://demo.applitools.com/app.html", actual);
	    driver.close();
	}

}
