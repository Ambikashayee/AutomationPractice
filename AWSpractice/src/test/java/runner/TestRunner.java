package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith
(Cucumber.class)

@CucumberOptions
(
features = "C:\\Users\\Welcome\\eclipse-workspace\\AWSpractice\\src\\test\\java\\Featurefile\\Test1.feature",
glue = {"C:\\Users\\Welcome\\eclipse-workspace\\AWSpractice\\src\\test\\java\\Stepdefenition"}

)


public class TestRunner{


}


