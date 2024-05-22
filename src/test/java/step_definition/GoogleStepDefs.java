package step_definition;

import org.junit.Assert;

import driverManager.CreateDriverSingleton;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GooglePage;

public class GoogleStepDefs {
	GooglePage gp = new GooglePage(CreateDriverSingleton.getInstance().getDriver());
	
	@Given("User must be on homepage {string}")
	public void user_must_be_on_homepage(String string) {
		CreateDriverSingleton.getInstance().getDriver().get(string);
	}
	
	@Then("Title should be {string}")
	public void title_should_be(String expectedTitle) {
		String title = gp.getTitle();
	    Assert.assertEquals(expectedTitle, title);
	}

	@When("Search for {string} in search box")
	public void search_for_in_search_box(String string) throws InterruptedException {
	    gp.search(string);
	    Thread.sleep(1000);
	}

	@Then("Title should contain {string}")
	public void title_should_contain(String string) {
		String title = gp.getTitle();
		Boolean result = title.contains(string);
	    Assert.assertEquals(true, result);
	}

}
