package signin_page;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SigninPage extends BasePage {

    @FindBy(id = "username")
    public WebElement inputEmailField;
    @FindBy(id = "password")
    public WebElement inputPasswordField;
    @FindBy(id = "SigninButton")
    public WebElement signinBtn;
    @FindBy(id = "loginModalHeader")
    public WebElement loginHeader;

    public SigninPage(){
        PageFactory.initElements(driver, this);
    }

    public void typeEmail(String email){
        sendKeysToElement(inputEmailField, email);
    }
    public void typePassword(String password){
        sendKeysToElement(inputPasswordField, password);
    }

    public void clickSigninBtn(){
        clickOnElement(signinBtn);
    }
    public void header(){
        loginHeader.getText();
    }

    public void signIn(String email, String password){
        typeEmail(email);
        typePassword(password);
        clickSigninBtn();
        try{
            webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginModalHeader")));
            WebElement userInputName = driver.findElement(By.id("username"));
            WebElement userPassword = driver.findElement(By.id("password"));
            userInputName.sendKeys(email);
            userPassword.sendKeys(password);
            WebElement submit = driver.findElement(By.id("SigninButton"));
            submit.click();
        }catch (TimeoutException e){
            e.printStackTrace();
        }
    }
}
