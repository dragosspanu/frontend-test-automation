package qa.automation.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.Select;
import qa.automation.pages.ContactUsPage;
import qa.automation.utils.FileUtil;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

public class ShopUserSteps {

    ContactUsPage contactUsPage;

    @Step
    public void isInTheContactUsSection() {
        contactUsPage.open();
        assertThat(contactUsPage.getDriver().getPageSource(), containsString("<title>Contact us - My Store</title>"));
    }

    @Step
    public void selectHeading(String heading) {
        Select headingSelect = new Select(contactUsPage.headingSelect);
        headingSelect.selectByVisibleText(heading);
    }

    @Step
    public void insertEmailAccount(String emailAccount) {
        contactUsPage.emailField.type(emailAccount);
    }

    @Step
    public void insertOrderReference(String orderReference) {
        contactUsPage.orderReferenceField.type(orderReference);
    }

    @Step
    public void insertTextMessage(String location) {
        contactUsPage.messageField.type(FileUtil.readTextFileAsString(location));
    }

    @Step
    public void callToActionButton() {
        contactUsPage.sendButton.click();
    }

    @Step
    public void successMessageIsShown(String successMessage) {
        assertThat(contactUsPage.successMessage.getText(), equalTo(successMessage));
    }
}