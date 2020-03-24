package qa.automation.steps.serenity;

import net.thucydides.core.annotations.Step;
import qa.automation.pages.DictionaryPage;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.MatcherAssert.assertThat;

public class DictionaryUserSteps {

    DictionaryPage dictionaryPage;

    @Step
    public void isOnTheHomePage() {
        dictionaryPage.open();
    }

    @Step
    public void looksFor(String keyword) {
        dictionaryPage.searchTerms.type(keyword);
        dictionaryPage.lookupButton.click();
    }

    @Step
    public void definitionIsDisplayed(String definition) {
        assertThat(dictionaryPage.getDefinitions(), hasItem(containsString(definition)));
    }

}