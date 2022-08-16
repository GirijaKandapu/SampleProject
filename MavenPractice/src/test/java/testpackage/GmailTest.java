package testpackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="Feature/Sample.feature", glue="stepdefinitionpackage", tags="@Sample1", plugin="html:target/cucumber html test report")
public class GmailTest extends AbstractTestNGCucumberTests {

	@BeforeClass
	public void init() {
		System.out.println("Before hook invoked");
	}
	
	@AfterClass
	public void cleanUp() {
		System.out.println("After hook invoked");
	}
}
