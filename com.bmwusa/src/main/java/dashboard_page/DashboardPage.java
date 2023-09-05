package dashboard_page;

import base.BasePage;
import login_page.LoginPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shopping_page.ShoppingPage;

public class DashboardPage extends BasePage {

    @FindBy(xpath = "//a[@id='accountsBtn']")
    public WebElement myAccountBtn;
    @FindBy(xpath = "//span[.='Shopping']")
    public WebElement shoppingLink;
    @FindBy(xpath = "//a[@href='https://www.shopbmwusa.com/']")
    public WebElement shopPartsLink;
    @FindBy(xpath ="//span[.='My BMW']")
    public WebElement myBmwLink;
    @FindBy(xpath="//span[.='Log Out of My BMW']")
    public WebElement logoutBtn;



    public DashboardPage(){
        PageFactory.initElements(driver, this);
    }


    public void clickOnMyBmw(){
        safeClickOnElement(myBmwLink);
    }
    public void clickOnLogOutBtn(){
        safeClickOnElement(logoutBtn);
    }

    public LoginPage logOut(){
        clickOnMyBmw();
        clickOnLogOutBtn();
        return new LoginPage();
    }

    public void  clickOnShoppingLink(){
        safeClickOnElement(shoppingLink);
    }
    public void  clickOnShopPartsLink(){
        safeClickOnElement(shopPartsLink);
    }

    public ShoppingPage switchToNewTab(){
        clickOnShoppingLink();
        clickOnShopPartsLink();
        switchToTab();

        return new ShoppingPage();
    }
}
