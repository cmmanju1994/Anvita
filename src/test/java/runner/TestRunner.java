package runner;

import org.testng.annotations.DataProvider;

// ctr+i(indentation)
// ctrl+shift+o (for import)
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




@CucumberOptions( 
		features={".//Features/LoginFunctioniality.feature"},
		//features= {".//Features"},
		dryRun=false,
		glue="steps",
		plugin= {"pretty","html:Reports/myreport.html",
				 "rerun:target/failedTest.txt"
				 
		              }
		//tags="@Regression" 
	            )

public class TestRunner extends AbstractTestNGCucumberTests {
	
	@Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }

}
