import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends BasePage {

    @FindBy(xpath = "//div[@id='block-collapsible-nav']//a[. ='My Orders']")
    public WebElement buttonMyOrders;
    @FindBy(xpath = "//div[@id='block-collapsible-nav']//a[. ='My Downloadable Products']")
    public WebElement buttonDownloadableProducts;
    @FindBy(xpath = "//div[@id='block-collapsible-nav']//a[. ='My Wish List']")
    public WebElement buttonMyWishList;
    @FindBy(xpath = "//div[@id='block-collapsible-nav']//a[. ='Address Book']")
    public WebElement buttonAddressBook;
    @FindBy(xpath = "//div[@id='block-collapsible-nav']//a[. ='Account Information']")
    public WebElement buttonAccountInformation;
    @FindBy(xpath = "//div[@id='block-collapsible-nav']//a[. ='Stored Payment Methods']")
    public WebElement buttonStoredPaymentMethods;
    @FindBy(xpath = "//div[@id='block-collapsible-nav']//a[. ='My Product Reviews']")
    public WebElement buttonMyProductReviews;

    public MyAccountPage(){
        PageFactory.initElements(driver, this);
    }

    public void clickMyOrderBtn(){
        clickOnElement(buttonMyOrders);
    }
    public void clickMyDownloadableProductsBtn(){
        clickOnElement(buttonDownloadableProducts);
    }
    public void clickMyWishBtn(){
        clickOnElement(buttonMyWishList);
    }
    public void clickAddressBookBtn(){
        clickOnElement(buttonAddressBook);
    }
    public void clickAccountInformationBtn(){
        clickOnElement(buttonAccountInformation);
    }
    public void clickStoredPaymentMethodsBtn(){
        clickOnElement(buttonStoredPaymentMethods);
    }
    public void clickMyProductReviewsBtn(){
        clickOnElement(buttonMyProductReviews);
    }

    public void UrlLinks(){
        clickMyOrderBtn();
        clickMyDownloadableProductsBtn();
        clickMyWishBtn();
        clickAccountInformationBtn();
        clickStoredPaymentMethodsBtn();
        clickMyProductReviewsBtn();
    }

    public AddressBookPage addressBook(){
        clickAddressBookBtn();

        return new AddressBookPage();
    }
}
