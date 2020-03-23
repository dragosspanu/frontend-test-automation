package qa.automation.steps.serenity;

import net.thucydides.core.annotations.Step;
import qa.automation.pages.ContactUsPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class ShopUserSteps {

    ContactUsPage contactUsPage;

    @Step
    public void isInTheContactUsSection(){
//        assertThat(contactUsPage.getDriver().getPageSource(), containsString("<title>Contact us - My Store</title>"));
    }

    @Step
    public void selectHeading(String heading) {
        System.out.println(heading);
    }

    @Step
    public void insertEmailAccount(String emailAccount) {
        contactUsPage.insertEmail(emailAccount);
    }

    @Step
    public void insertOrderReference(String orderReference) {
    }

    @Step
    public void attachFile(String location) {
    }

    @Step
    public void insertTextMessage(String location) {
    }

    @Step
    public void callToActionButton() {
    }

    @Step
    public void successMessageIsShown(String successMessage) {
    }
}