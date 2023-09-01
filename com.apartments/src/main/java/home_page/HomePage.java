package home_page;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import signin_page.SigninPage;

public class HomePage extends BasePage {

    @FindBy(xpath = "//div[@class='loginPrevNextWrapper']//a[. = 'Sign Up']")
    public WebElement linkSignUp;

    @FindBy(xpath = "//div[@class='loginPrevNextWrapper']//a[. = 'Sign In']")
    public WebElement linkSignIn;

    @FindBy(id = "quickSearchLookup")
    public WebElement inputSearchField;

    @FindBy(xpath = "//button[@class='go']//span[. = 'Search']")
    public WebElement SearchBtn;

    public HomePage(){
        PageFactory.initElements(driver, this);
    }
    public void clickSignIn(){
        clickOnElement(linkSignIn);
    }

    public SigninPage signInlink(){
        clickSignIn();
        return new SigninPage();
    }
}
