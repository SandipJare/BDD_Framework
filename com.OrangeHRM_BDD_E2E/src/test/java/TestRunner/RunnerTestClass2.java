package TestRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = { "AllFeatureFiles/OrangeHRM.feature" }, 
					glue = {"StepDefinition" }, 
					dryRun = false,
					monochrome = true, 
					plugin = { "pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }

)

public class RunnerTestClass2 extends AbstractTestNGCucumberTests {

}
