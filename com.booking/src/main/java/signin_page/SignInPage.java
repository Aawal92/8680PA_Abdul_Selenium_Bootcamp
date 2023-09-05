package signin_page;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends BasePage {
    @FindBy(xpath = "//input[@type='email']")
    public WebElement emailInputField;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitBtn;
    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordInputField;
    @FindBy(xpath = "//button[@type='submit']//span[. = 'Sign in']")
    public WebElement accountSignBtn;
    @FindBy(id = "px-captcha")
    public WebElement pressHold;
    @FindBy(xpath = "//p[. = 'Press and hold']")
    public WebElement PressAndHoldBtn;

    public SignInPage(){
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
    public void clickAccountSignIn(){
        safeClickOnElement(accountSignBtn);
    }
    public void clickPressBtn(){
        safeClickOnElement(PressAndHoldBtn);
    }

    public void signIn(String email, String password){
        typeEmail(email);
        clickSubmitBtn();
        typePassword(password);
        clickAccountSignIn();

    }
}
