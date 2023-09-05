package job_page;

import base.BasePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobPage extends BasePage {
    public JobPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@id='keyword']")
    public WebElement keywordInputBtn;
    @FindBy(xpath = "//select[@id='filtercategory']")
    public WebElement egTeamDropDown;

    @FindBy(xpath = "//select[@id='filtercountry']")
    public WebElement countryDropDown;

    @FindBy(xpath = "//button[@class='Hero-search__form__button button button--green-1 button--lg']")
    public WebElement letsGoBtn;

    @FindBy(xpath="//h1[@class='Search-header__title text-xl text-white aos-init aos-animate']")
    public WebElement resultText;


    public void enterKeyword(String keyWord){
        sendKeysToElement(keywordInputBtn,keyWord);
    }

    public void selectFromEgTeamDropDown(){
        selectFromDropdownByVisibleText(egTeamDropDown,"Technology");
    }
    public void selectFromCountryDropDown(){
        selectFromDropdownByVisibleText(countryDropDown,"United States");
    }
    public void clickOnLetsGoBtn(){
        safeClickOnElement(letsGoBtn);
    }
    public void findJob(String title){
        enterKeyword(title);
        selectFromEgTeamDropDown();
        selectFromCountryDropDown();
        clickOnLetsGoBtn();
    }
}