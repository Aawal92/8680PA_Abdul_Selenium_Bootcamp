package shopping_page;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingPage extends BasePage {

    @FindBy(xpath = "//button[@class='globalnav-primary__main-link']//span[.='Shopping']")
    public WebElement shoppingBtn;
    @FindBy(xpath = "//a[@href='https://www.shopbmwusa.com/']")
    public WebElement partAndAccessoriesLink;
    @FindBy(xpath = "(//div[@class='card cardDiv']//a[@href='/KEYCHAINS-CONTROL'])[1]")
    public WebElement keyChain;
    @FindBy(xpath = "//div[@class='card-body DivProSlider']//a[@href='/product/11372/BMW-LEATHER-KEY-CASE']")
    public WebElement leatherKeyCase;
    @FindBy(id = "[id='btnAddToCart']")
    public WebElement addCartBtn;

    public ShoppingPage(){
        PageFactory.initElements(driver, this);
    }

    public void clickShoppingBtn(){
        safeClickOnElement(shoppingBtn);
    }
    public void clickAccessoryLink(){
        safeClickOnElement(partAndAccessoriesLink);
    }
    public void clickKeyChain(){
        safeClickOnElement(keyChain);
    }
    public void clickKeyChainCase(){
        safeClickOnElement(leatherKeyCase);
    }
    public void clickAddCart(){
        safeClickOnElement(addCartBtn);
    }

    public void doShop(){
        clickAccessoryLink();
        clickKeyChain();
        clickKeyChainCase();
        clickAddCart();
    }
}
