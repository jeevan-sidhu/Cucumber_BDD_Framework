package step_definition;

import org.junit.Assert;

import driverManager.CreateDriverSingleton;
import io.cucumber.java.en.Then;
import pages.FacebookPage;

public class FbStepDefs {
	FacebookPage fb = new FacebookPage(CreateDriverSingleton.getInstance().getDriver());
	
	@Then("Forgot password link should be displayed")
	public void forgot_password_link_should_be_displayed() {
	    Boolean actual = fb.verifyForgotPwdLink();
	    Assert.assertEquals(true, actual);
	}

}
