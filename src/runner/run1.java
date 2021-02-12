package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "Feature/Functionality.feature",glue={"script","hooks"},tags="@Function1")
public class run1 {
	
}
