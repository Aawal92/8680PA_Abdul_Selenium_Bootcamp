import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrdersAndReturnsPage extends BasePage {

    @FindBy(id = "oar-order-id")
    public WebElement inputOrderIdField;
    @FindBy(id = "oar-billing-lastname")
    public WebElement inputBillingLastNameField;
    @FindBy(id = "quick-search-type-id")
    public WebElement inputFindOrderByField;
    @FindBy(id = "oar_email")
    public WebElement inputEmailField;
    @FindBy(xpath = "//button[@type = 'submit']")
    public WebElement continueBtn;

    public OrdersAndReturnsPage(){
        PageFactory.initElements(driver, this);
    }

    public void typeOrderId(String id){
        sendKeysToElement(inputOrderIdField, id);
    }
    public void typeBillingLastName(String lastName){
        sendKeysToElement(inputBillingLastNameField, lastName);
    }
    public void typeFindOrderBy(String email){
        sendKeysToElement(inputFindOrderByField, email);
    }
    public void typeEmail(String email2){
        sendKeysToElement(inputEmailField, email2);
    }
    public void clickContinueBtn(){
        clickOnElement(continueBtn);
    }

    public void orderInformation(String id, String lastName, String email,String email2 ){
        typeOrderId(id);
        typeBillingLastName(lastName);
        typeFindOrderBy(email);
        typeEmail(email2);
        clickContinueBtn();
    }

}
