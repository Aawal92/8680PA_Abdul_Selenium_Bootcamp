import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdvancedSearchPage extends BasePage {
    @FindBy(id = "name")
    public WebElement inputProductNameField;
    @FindBy(id = "sku")
    public WebElement inputSkuField;
    @FindBy(id = "description")
    public WebElement inputDescriptionField;
    @FindBy(id = "short_description")
    public WebElement inputShortDescription;
    @FindBy(xpath = "//input[@name = 'price[from]']")
    public WebElement inputPriceField;
    @FindBy(xpath = "//input[@name = 'price[to]']")
    public WebElement inputUsCurrencyField;
    @FindBy(xpath = "//div[@class='primary']//button[@class='action search primary']")
    public WebElement searchBtn;
    public AdvancedSearchPage(){
        PageFactory.initElements(driver, this);
    }

    public void typeProductName(String productName){
        sendKeysToElement(inputProductNameField, productName);
    }
    public void typeSku(String sku){
        sendKeysToElement(inputSkuField, sku);
    }
    public void typeDescription(String description){
        sendKeysToElement(inputDescriptionField, description);
    }
    public void typeShortDescription(String shortDescription){
        sendKeysToElement(inputShortDescription, shortDescription);
    }
    public void typePrice(String price){
        sendKeysToElement(inputPriceField, price);
    }
    public void typeUSDPrice(String usd){
        sendKeysToElement(inputUsCurrencyField, usd);
    }

    public void clickSearchBtn(){
        clickOnElement(searchBtn);
    }

    public void advancedSearch(String productName, String sku, String description, String shortDescription, String price, String usd ){
        typeDescription(productName);
        typeSku(sku);
        typeDescription(description);
        typeShortDescription(shortDescription);
        typePrice(price);
        typeUSDPrice(usd);
        clickSearchBtn();
    }
}
