import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    @FindBy(xpath = "//li[@class='authorization-link']")
    public WebElement signInLink;
    @FindBy(id = "email")
    public WebElement emailInputField;
    @FindBy(id = "pass")
    public WebElement passwordInputField;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInBtn;
    @FindBy(xpath = "//div[@class = 'widget block block-static-block']//a[. = 'Subscribe to our mailing list']")
    public WebElement subscribeBtn;
    @FindBy(xpath = "//ul[@class = 'footer links']//a[. = 'Orders and Returns']")
    public WebElement ordersReturnBtn;
    @FindBy(xpath = "//li[@class='nav item']//a[. = 'Advanced Search']")
    public WebElement advancedSearchBtn;
    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

    public void clickSignInLink(){
        clickOnElement(signInLink);
    }
    public void typeEmailId(String validEmail){
        sendKeysToElement(emailInputField, validEmail);
    }
    public void typePassword(String validPassword){
        sendKeysToElement(passwordInputField, validPassword);
    }
    public void clickSignBtn(){
        clickOnElement(signInBtn);
    }

    public void clickSubscribeBtn(){
        clickOnElement(subscribeBtn);
    }
    public void clickOrderReturnBtn(){
        clickOnElement(ordersReturnBtn);
    }
    public void clickAdvancedSearchBtn(){
        clickOnElement(advancedSearchBtn);
    }



    public MyAccountPage login(String email, String password){

        clickSignInLink();
        typeEmailId(email);
        typePassword(password);
        clickSignBtn();

        return new MyAccountPage();
    }

    public SubscribePage subscribe(){
        clickSubscribeBtn();

        return new SubscribePage();
    }

    public OrdersAndReturnsPage ordersReturn(){
        clickOrderReturnBtn();

        return new OrdersAndReturnsPage();
    }

    public AdvancedSearchPage advancedSearch(){
        clickAdvancedSearchBtn();

        return new AdvancedSearchPage();
    }

}
