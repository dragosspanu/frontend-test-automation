package qa.automation;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        plugin = {"html:target/cucumber-html-report", "json:target/cucumber-json-report.json"})
public class Ui3TestSuite {
}
