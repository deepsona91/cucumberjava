package StepDefinitions;
/**
 * This is a test runner class which will take feature files from features = "src/test/resources/FeatureFiles"
 * Link(glue) this feature files with step definition classes placed under StepDefinitions folder(Look up project 
 * explorer to understand the project/folder structure)
 * tags tells go and run the features and scenarios which has @smoke tag and @regression tag.
 * similarly or and grouping can be used as well.
 * To run maven test right click on project and run as Maven test.
 * To run maven test from console goto pom xml directory and from command line
 * run mvn test. Make sure Java Bin path and maven bin path is added in environment path  
 */

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/FeatureFiles", 
		glue = {"StepDefinitions" }, 
		monochrome = true, 
		/**
		 * uncomment the below line if you want to generate cucumber html report.
		 * @author Deep
		 *
		 */
		//plugin = { "pretty", "html:target/cucumber-reports/html/report.html"
		plugin = {"json:target/cucumber.json"},
		tags= "@smokescenario"
		)
public class TestRunner {
	
	//keeping this blank for better :)
}
