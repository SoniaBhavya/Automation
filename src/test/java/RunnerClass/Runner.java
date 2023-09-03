package RunnerClass;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/FeatureFiles/checkOut.feature"},
        glue = {"StepDefinitions"},

        plugin = {"pretty","html:target/cucumber-reports.html"},
        monochrome = true
)

public class Runner {
}
