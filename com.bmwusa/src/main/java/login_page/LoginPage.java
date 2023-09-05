package login_page;

import base.BasePage;
import dashboard_page.DashboardPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailInputField;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordInputField;
    @FindBy(xpath = "//button[@class='custom-button __b primary']")
    public WebElement loginBtn;

    public LoginPage(){
        PageFactory.initElements(driver, this);
    }
    public void typeEmail(String loginEmail){
        sendKeysToElement(emailInputField,loginEmail);
    }

    public void typePassword(String loginPassword){
        sendKeysToElement(passwordInputField,loginPassword);
    }
    public void clickOnLoginButton(){
        safeClickOnElement(loginBtn);
    }

    public DashboardPage doSign(String emailAddress, String password){
        typeEmail(emailAddress);
        typePassword(password);
        clickOnLoginButton();
        return new DashboardPage();
    }

}
