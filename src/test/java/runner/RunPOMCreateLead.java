package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)

@CucumberOptions(features= {"src/test/java/features/POMCreateLead.feature"},glue= {"runner","pages"},tags= {"@Smoke"},monochrome=true)

public class RunPOMCreateLead {	
	

}
