package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions( 
		features={"@target/failedTest.txt"},
		//features= {".//Features"},
		dryRun=false,
		glue="steps",
		plugin= {"pretty","html:Reports/myreport.html"
				
				 
		              }
		//tags="@Regression" 
	            )
public class TestRunner2 extends AbstractTestNGCucumberTests {

}
