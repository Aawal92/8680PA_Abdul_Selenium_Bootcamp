package attraction_page;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AttractionPage extends BasePage {

    @FindBy(xpath = "//div[@class = 'css-sk1ghe']//div[.='Key West']")
    public WebElement KeyWestBtn;
    @FindBy(xpath = "//span[@class='cdadcf1b05']//label[. = 'Most popular']")
    public WebElement mostPopular;
    @FindBy(xpath = "//div[@class ='css-v2yit6']//h4[. = 'Key West Sunset Cruise']")
    public WebElement KeyWestCruseBtn;


    public AttractionPage(){
        PageFactory.initElements(driver, this);
    }
    public void clickKeyWestBtn(){
        safeClickOnElement(KeyWestBtn);
    }
    public void clickMostPopular(){
        safeClickOnElement(mostPopular);
    }
    public void clickKeyWestCurse(){
        safeClickOnElement(KeyWestCruseBtn);
    }


    public void attraction(){
        clickKeyWestBtn();
        clickMostPopular();
        clickKeyWestCurse();

    }


}
