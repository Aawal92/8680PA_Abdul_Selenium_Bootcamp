package home_page;

import attraction_page.AttractionPage;
import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    @FindBy(xpath = "//div[@class = 'aca0ade214 aaf30230d9 c2931f4182 e7d9f93f4d faf8b5d9a5']//a[@aria-label ='Create an account']")
    public WebElement signUpBtn;
    @FindBy(xpath = "//a[@aria-label = 'Sign in']")
    public WebElement signInBtn;
    @FindBy(id = "attractions")
    public WebElement AttractionsBtn;


    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    public void clickSignUpBtn(){
        safeClickOnElement(signUpBtn);
    }
    public void clickSignInBtn(){
        safeClickOnElement(signInBtn);
    }
    public AttractionPage clickAttractionBtn(){
        safeClickOnElement(AttractionsBtn);

        return new AttractionPage();
    }

}
