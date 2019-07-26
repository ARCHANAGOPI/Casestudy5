package cs4;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/feature/cs4.feature",plugin="json:target\\jsonreport.json")
public class runner {

}
