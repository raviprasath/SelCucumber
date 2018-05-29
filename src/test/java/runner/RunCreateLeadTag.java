package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)

@CucumberOptions(features= {"src/test/java/features/CreateLeadTag.feature"},glue="steps",tags= {"@Smoke"},monochrome=true)

public class RunCreateLeadTag {	
	

}
