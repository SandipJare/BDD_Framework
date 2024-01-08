package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
		features= {"AllFeatureFiles"},
		glue= {"StepDefinition"},
		dryRun=false,
		monochrome=true,
		
		plugin= {"html:Reports/abc.html",
				"json:Reports/bcd.json",
				"junit:Reports/cde.xml",
				"pretty:Reports/edf.txt"}
		)


public class RunnerClass extends AbstractTestNGCucumberTests{

	
	
	
}
