package home_page;

import base.BasePage;
import login_page.LoginPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    @FindBy(xpath = "//a[@href = 'http://mybmw.bmwusa.com']")
    public WebElement loginLink;
    @FindBy(xpath = "(//button[@name='search'])[2]")
    public WebElement searchBtn;
    @FindBy(xpath = "(//input[@name='site search'])[2]")
    public WebElement searchInputField;
    @FindBy(xpath = "//div[@class='globalnav-primary-search-results bmw-grid-col-default-25 bmw-grid-col-lg-10 bmw-grid-col-lg-offset-14 globalnav-primary-search-results--active']//a[.='MyBMW']")
    public WebElement myBMWBtn;
    @FindBy(xpath = "//a[@href='/vehicles/all-electric/ix/sports-activity-vehicle/overview.html.html']")
    public WebElement electricCarFeature;

    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    public LoginPage clickOnLoginLink() {
        safeClickOnElement(loginLink);
        return new LoginPage();
    }
}
