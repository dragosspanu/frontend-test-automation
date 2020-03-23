package qa.automation.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import qa.automation.steps.serenity.DictionaryUserSteps;

public class DictionarySteps {

    @Steps
    DictionaryUserSteps dictionaryUserSteps;

    @Given("^the user is on the Wiktionary home page$")
    public void givenTheUserIsOnTheWikionaryHomePage() {
        dictionaryUserSteps.isOnTheHomePage();
    }

    @When("^the user looks up the definition of the \"([^\"]*)\"$")
    public void whenTheUserLooksUpTheDefinitionOf(String word) {
        dictionaryUserSteps.looksFor(word);
    }

    @Then("^the \"([^\"]*)\" definition is displayed$")
    public void thenTheDefinitionIsDisplayed(String definition) {
        dictionaryUserSteps.definitionIsDisplayed(definition);
    }
}
