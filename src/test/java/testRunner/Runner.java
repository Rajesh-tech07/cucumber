package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
		features = {"src/test/resources/features"},
		dryRun = false,
		glue ="stepDefinition",
		snippets = SnippetType.CAMELCASE,
		monochrome = true
		)
public class Runner extends AbstractTestNGCucumberTests{

}
