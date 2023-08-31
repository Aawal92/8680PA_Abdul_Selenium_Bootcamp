package login_page;

import base.BasePage;
import dashboard_page.DashboardPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage extends BasePage {
    @FindBy(xpath = "//input[@name='email']")
    public WebElement inputEmailField;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement inputPasswordField;

    @FindBy(xpath = "//div[@class = 'ui fluid large blue submit button']")
    public WebElement loginBtn;
    public LogInPage(){
        PageFactory.initElements(driver, this);
    }

    public void typeEmail(String email){
        sendKeysToElement(inputEmailField, email);
    }
    public void typePassword(String password){
        sendKeysToElement(inputPasswordField, password);
    }

    public void clickLoginBtn(){
        clickOnElement(loginBtn);
    }

    public DashboardPage login(String email, String password){
        typeEmail(email);
        typePassword(password);
        clickLoginBtn();

        return new DashboardPage();
    }


}
