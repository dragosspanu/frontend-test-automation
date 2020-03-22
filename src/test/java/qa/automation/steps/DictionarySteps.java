package qa.automation.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import qa.automation.steps.serenity.DictionaryUserSteps;

public class DictionarySteps {

    @Steps
    DictionaryUserSteps anna;

    @Given("^the user is on the Wiktionary home page$")
    public void givenTheUserIsOnTheWikionaryHomePage() {
        anna.is_the_home_page();
    }

    @When("^the user looks up the definition of the \"([^\"]*)\"$")
    public void whenTheUserLooksUpTheDefinitionOf(String word) {
        anna.looks_for(word);
    }

    @Then("^he should see the \"([^\"]*)\"$")
    public void thenTheyShouldSeeADefinitionContainingTheWords(String definition) {
        anna.should_see_definition(definition);
    }
}
