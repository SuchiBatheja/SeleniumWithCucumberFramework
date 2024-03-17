package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/com/AppFeatures"},
		glue = {"stepDefinitions", "AppHooks"},
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"	},
				monochrome=true
				//publish=true
					
		
		)

public class MyTestRunner {

	
}


//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"