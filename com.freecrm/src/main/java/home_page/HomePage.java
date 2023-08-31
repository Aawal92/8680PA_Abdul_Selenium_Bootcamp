package home_page;

import base.BasePage;
import login_page.LogInPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    @FindBy(xpath = "//ul[@class='nav navbar-nav navbar-right']//a[. = 'Sign Up']")
    public WebElement buttonSignUp;

    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    public LogInPage clickSignUpLink(){
        clickOnElement(buttonSignUp);
        return new LogInPage();
    }




}
