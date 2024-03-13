package test_runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\jvnsi\\eclipse-workspace\\BDD_framework\\src\\test\\java\\features",
glue= {"step_definition"}, plugin= {"pretty","html:target/html_reports.html"}, monochrome=true,
dryRun=false, tags="not @smoke")

public class Test_Runner {

}
