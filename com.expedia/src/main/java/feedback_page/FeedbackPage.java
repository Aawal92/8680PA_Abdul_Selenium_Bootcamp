package feedback_page;

import base.BasePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FeedbackPage extends BasePage {
    public FeedbackPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//a[contains(.,'Website Feedback  »')]")
    public WebElement websiteFeedback;
    @FindBy(xpath="//label[.='4★']")
    public WebElement ratingBtn;

    @FindBy(xpath = "//textarea[@id='verbatim']")
    public WebElement textInputField;

    @FindBy(xpath = "//button[@id='submit-button']")
    public WebElement submitBtn;

    @FindBy(xpath = "//p[@class='question-header']")
    public WebElement thankYouMessage;


    public void clickOnWebsiteFeedBack(){
        safeClickOnElement(websiteFeedback);
    }

    public void clickOnStarRateButton(){
        safeClickOnElement(ratingBtn);
    }
    public void enterReviewText(String text){
        sendKeysToElement(textInputField, text);
    }
    public void clickOnSubmitButton(){
        safeClickOnElement(submitBtn);
    }

    public void doFeedBack(String text){
        clickOnWebsiteFeedBack();
        clickOnStarRateButton();
        enterReviewText(text);
        clickOnSubmitButton();
    }

}