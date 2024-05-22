package test_runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features="./src/test/resources/features",
		glue= {"step_definition","hooks"},
		plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		monochrome=true,
		dryRun=false,
		tags="@fb or @google"
)
public class TestNgRunner extends AbstractTestNGCucumberTests {
	
	@DataProvider(parallel=true)
	@Override
	public Object[][] scenarios() {
		return super.scenarios();
	}

}
