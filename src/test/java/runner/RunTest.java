package runner;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

import java.io.File;


@RunWith(Cucumber.class)
@CucumberOptions(features={"src//test//java//features//SimpleScenario.feature"}
					,glue={"stepdefinations","utility"}
					,plugin = {"html:target/cucumber-html-report","pretty",
		"com.cucumber.listener.ExtentCucumberFormatter:output/report.html","json:target/cucumber/cucumber.json"}
					, tags ={"@Test"}
		)

public class RunTest extends AbstractTestNGCucumberTests {
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File("./src/test/java/utility/extent-config.xml"));
		Reporter.setSystemInfo("User Name", "Ranjith");
		Reporter.setSystemInfo("Application Name", "Test App");
		Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
	}
}
