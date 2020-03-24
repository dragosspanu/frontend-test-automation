package qa.automation.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import qa.automation.steps.serenity.ShopUserSteps;

public class ShopSteps {

    @Steps
    ShopUserSteps shopUserSteps;

    @Given("^the user is in the shop's Contact Us section$")
    public void givenTheUserIsInTheShopsContactUsSection() {
        shopUserSteps.isInTheContactUsSection();
    }

    @When("^the user selects \"([^\"]*)\" as Subject Heading$")
    public void whenTheUserSelectsSubjectHeading(String heading) {
        shopUserSteps.selectHeading(heading);
    }

    @When("^he inserts his email account \"([^\"]*)\"$")
    public void whenTheUserInsertsEmailAccount(String emailAccount) {
        shopUserSteps.insertEmailAccount(emailAccount);
    }

    @When("^he inserts his order reference \"([^\"]*)\"$")
    public void whenTheUserInsertsOrderReference(String orderReference) {
        shopUserSteps.insertOrderReference(orderReference);
    }

    @When("^he inserts his text message \"([^\"]*)\"$")
    public void whenTheUserInsertsTextMessage(String location) {
        shopUserSteps.insertTextMessage(location);
    }

    @When("^he clicks the CTA button$")
    public void whenTheUserClicksCtaButton() {
        shopUserSteps.callToActionButton();
    }

    @Then("^the \"([^\"]*)\" success message is shown$")
    public void thenTheSuccessMessageIsShown(String successMessage) {
        shopUserSteps.successMessageIsShown(successMessage);
    }
}
