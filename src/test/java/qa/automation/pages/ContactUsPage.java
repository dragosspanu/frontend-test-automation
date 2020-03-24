package qa.automation.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://automationpractice.com/index.php?controller=contact")
public class ContactUsPage extends PageObject {

    @FindBy(id = "id_contact")
    public WebElementFacade headingSelect;

    @FindBy(id = "email")
    public WebElementFacade emailField;

    @FindBy(id = "id_order")
    public WebElementFacade orderReferenceField;

    @FindBy(id = "message")
    public WebElementFacade messageField;

    @FindBy(id = "submitMessage")
    public WebElementFacade sendButton;

    @FindBy(className = "alert-success")
    public WebElementFacade successMessage;
}