package shared;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SystemBar extends BasePage {

    @FindBy(xpath = "//header[@class = 'page-header']//a[@class='logo']")
    public WebElement companyLogo;
    @FindBy(xpath = "//header[@class = 'page-header']//a[@class='action showcart']")
    public WebElement buttonCart;
    @FindBy(id = "search")
    public WebElement searchBox;

    @FindBy(xpath = "//span[@class='customer-name']//button[@type='button']")
    public WebElement buttonDropDown;

    @FindBy(xpath = "//li[@class='customer-welcome active']//a[contains(.,'Sign Out')]")
    public WebElement buttonSignOut;

    public SystemBar(){
        PageFactory.initElements(driver, this);
    }

    public void clickCompanyLogo(){
        clickOnElement(companyLogo);
    }

    public void clickOnCart(){
        clickOnElement(buttonCart);
    }
    public void clickSearchButton(){
        clickOnElement(searchBox);
    }
    public void clickDropDownButton(){
        clickOnElement(buttonDropDown);
    }
    public void clickSignOutButton(){
        clickOnElement(buttonSignOut);
    }

    public void clickComponents(){
        clickCompanyLogo();
        clickOnCart();
        clickSearchButton();
    }

    public void clickLogOut(){
        clickDropDownButton();
        clickSignOutButton();
    }

}
