package signup_page;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends BasePage {
    @FindBy(xpath = "//input[@type='email']")
    public WebElement emailInputField;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitBtn;
    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordInputField;
    @FindBy(xpath = "//button[@type='submit']//span[. = 'Create account']")
    public WebElement createAccountBtn;
    public SignUpPage(){
        PageFactory.initElements(driver,this);
    }

    public void typeEmail(String email){
        sendKeysToElement(emailInputField,email);
    }
    public void clickSubmitBtn(){
        safeClickOnElement(submitBtn);
    }
    public void typePassword(String password){
        sendKeysToElement(passwordInputField,password);
    }
    public void clickCreateAccountBtn(){
        safeClickOnElement(createAccountBtn);
    }

    public void signUp(String email, String password){
        typeEmail(email);
        clickSubmitBtn();
        typePassword(password);
        clickCreateAccountBtn();

    }

}
