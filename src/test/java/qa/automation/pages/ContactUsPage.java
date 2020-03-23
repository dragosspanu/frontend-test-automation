package qa.automation.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import java.util.List;
import java.util.stream.Collectors;

@DefaultUrl("http://automationpractice.com/index.php?controller=contact")
public class ContactUsPage extends PageObject {

    @FindBy(id = "id_contact")
    public WebElementFacade headingSelect;

    @FindBy(id = "email")
    public WebElementFacade emailField;

    @FindBy(id = "id_order")
    public WebElementFacade orderReferenceField;

    @FindBy(id = "uniform-fileUpload")
    public WebElementFacade uploadFileButton;

    @FindBy(id = "message")
    public WebElementFacade messageField;

    @FindBy(id = "submitMessage")
    public WebElementFacade sendButton;

    @FindBy(className = "alert alert-success")
    public WebElementFacade successMessage;


    public void insertEmail(String emailAccount) {
        emailField.type(emailAccount);
    }
}