import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressBookPage extends BasePage {

    @FindBy(id = "firstname")
    public WebElement inputFirstNameField;
    @FindBy(id = "lastname")
    public WebElement inputLastNameField;
    @FindBy(id = "company")
    public WebElement inputCompanyField;
    @FindBy(id = "telephone")
    public WebElement inputPhoneNumberField;
    @FindBy(id = "street_1")
    public WebElement inputStreetAddressField;
    @FindBy(xpath = "//div[@class='control']//input[@name='city']")
    public WebElement inputCityField;
    @FindBy(xpath = "//select[@id='region_id']//option[.='Pennsylvania']")
    public WebElement selectStateBtn;
    @FindBy(id = "zip")
    public WebElement inputZipField;
    @FindBy(xpath = "//select[@id='country']//option[. = 'United States']")
    public WebElement selectCountryBtn;
    @FindBy(xpath = "//div[@class='primary']//button[@type='submit']")
    public WebElement saveAddressBtn;
    public AddressBookPage(){
        PageFactory.initElements(driver, this);
    }

    public void typeFirstName(String firstName){
        sendKeysToElement(inputFirstNameField, firstName);
    }

    public void typeLastName(String lastName){
        sendKeysToElement(inputLastNameField, lastName);
    }
    public void typeCompany(String company){
        sendKeysToElement(inputCompanyField, company);
    }
    public void typePhoneNumber(String phoneNumber){
        sendKeysToElement(inputPhoneNumberField, phoneNumber);
    }
    public void typeStreetAddress(String address){
        sendKeysToElement(inputStreetAddressField, address);
    }
    public void typeCity(String city){
        sendKeysToElement(inputCityField, city);
    }
    public void selectState(){
        clickOnElement(selectStateBtn);
    }
    public void typeZipCode(String zipcode){
        sendKeysToElement(inputZipField, zipcode);
    }
    public void selectCountry(){
        clickOnElement(selectStateBtn);
    }
    public void clickSaveAddressBtn(){
        clickOnElement(saveAddressBtn);
    }

    public void information(String firstName, String lastName, String company, String phoneNumber, String street, String city, String zipcode){
        typeFirstName(firstName);
        typeLastName(lastName);
        typeCompany(company);
        typePhoneNumber(phoneNumber);
        typeStreetAddress(street);
        typeCity(city);
        selectState();
        typeZipCode(zipcode);
        selectCountry();
        clickSaveAddressBtn();


    }
}
