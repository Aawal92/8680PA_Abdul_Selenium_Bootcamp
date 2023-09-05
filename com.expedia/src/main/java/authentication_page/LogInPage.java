package authentication_page;

import base.BasePage;
import home_page.HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage extends BasePage {


    @FindBy(xpath="//input[@id='loginFormEmailInput']")
    public WebElement inputEmailField;

    @FindBy(xpath="//*[@id=\"loginFormSubmitButton\"]")
    public WebElement continueBtn;

    @FindBy(xpath="//*[@id=\"passwordButton\"]")
    public WebElement enterPasswordBtn;

    @FindBy(xpath="//input[@id='enterPasswordFormPasswordInput']")
    public WebElement passwordInputField;

    @FindBy(xpath="//button[@id='enterPasswordFormSubmitButton']")
    public WebElement submitBtn;

    public LogInPage(){
        PageFactory.initElements(driver, this);
    }

    public void typeEmail(String email){
        sendKeysToElement(inputEmailField,email);
    }
    public void clickonContinueBtn(){
        jsClickOnElement(continueBtn);
    }
    public void clickOnEnterPasswordOption(){
        safeClickOnElement(enterPasswordBtn);
    }

    public void enterPassword(String password){
        sendKeysToElement(passwordInputField,password);
    }
    public void clickOnSubmitBtn(){
        safeClickOnElement(submitBtn);
    }


    public HomePage doSignIn(String email,String password){
        typeEmail(email);
        clickonContinueBtn();
        clickOnEnterPasswordOption();
        enterPassword(password);
        clickOnSubmitBtn();


        return new HomePage();
    }
}
