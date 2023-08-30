import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubscribePage extends BasePage {
    @FindBy(id = "mce-EMAIL")
    public WebElement inputEmailAddressField;
    @FindBy(id = "mce-FNAME")
    public WebElement inputFirstNameField;
    @FindBy(id = "mce-LNAME")
    public WebElement inputLastNameField;
    @FindBy(id = "mce-COMPANY")
    public WebElement inputCompanyNameField;
    @FindBy(id = "mce-POSITION")
    public WebElement inputPositionField;
    @FindBy(id = "mc-embedded-subscribe")
    public WebElement buttonSubscribe;

    public SubscribePage(){
        PageFactory.initElements(driver, this);
    }

    public void typeEmailAddress(String email){
        sendKeysToElement(inputEmailAddressField,email);
    }
    public void typeFirstName(String firstName){
        sendKeysToElement(inputFirstNameField, firstName);
    }
    public void typeLastName(String lastName){
        sendKeysToElement(inputLastNameField, lastName);
    }
    public void typeCompanyName(String companyName){
        sendKeysToElement(inputCompanyNameField, companyName);
    }
    public void typePosition(String position){
        sendKeysToElement(inputPositionField, position);
    }
    public void clickSubscribBtn(){
        clickOnElement(buttonSubscribe);
    }

    public void subscription(String email, String firstName, String lastName, String companyName, String position){
        typeEmailAddress(email);
        typeFirstName(firstName);
        typeLastName(lastName);
        typeCompanyName(companyName);
        typePosition(position);
        clickSubscribBtn();
    }
}
