package home_page;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import result_page.ResultPage;
import search_result_page.SearchResultPage;

public class HomePage extends BasePage {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@id='global-search-trigger']")
    public WebElement searchIcon;

    @FindBy(xpath = "//input[@id='global-search-input']")
    public WebElement searchInput;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement searchBtn;

    @FindBy(xpath = "//a[@name='&lpos=sitenavdefault+sitenav_soccer']//span[@class='link-text']")
    public WebElement soccerBtn;

    @FindBy(xpath = "//article[@id='sideLogin-left-rail']//button[@class='button-alt med'][normalize-space()='Log In']")
    public WebElement logInLink;

    @FindBy(name= "oneid-iframe")
    public WebElement iFrameLogin;
    @FindBy(xpath="//input[@id='InputIdentityFlowValue']")
    public WebElement inputEmailField;
    @FindBy(xpath="//button[@id='BtnSubmit']")
    public WebElement continueButton ;
    @FindBy(xpath = "//input[@id='InputPassword']")
    public WebElement passwordInputField;
    @FindBy(xpath ="//button[@id='BtnSubmit']")
    public WebElement loginBtn;

    @FindBy(xpath = "//article[@id='sideLogin-left-rail']//button[@class='button med'][normalize-space()='Sign Up']")
    public WebElement signUpLink;
    @FindBy(id = "InputFirstName")
    public WebElement InputFirstNameField;
    @FindBy(id = "InputLastName")
    public WebElement InputLastNameField;
    @FindBy(id = "password-new")
    public WebElement InputPasswordField;
    @FindBy(id="BtnSubmit")
    public WebElement submitBtn;

    public void clickSignUpLink(){
        safeClickOnElement(signUpLink);
    }
    public void typeFirstName(String firstName){
        sendKeysToElement(InputFirstNameField, firstName);
    }
    public void typeLastName(String lastName){
        sendKeysToElement(InputLastNameField, lastName);
    }
    public void  typePassword(String password){
        sendKeysToElement(InputPasswordField, password);
    }
    public void clickSubmitBtn(){
        safeClickOnElement(submitBtn);
    }


    @FindBy(xpath ="//*[@id='submenu-button-submenu-sportsactivemenusoccer']")
    public WebElement dropDownSoccerSection;
    @FindBy(xpath ="//span[@class='video-play-button video-play-button--onefeed']")
    public WebElement videoBtn;
    @FindBy(xpath ="//*[@id=\"vjs_video_3\"]/div[6]/button[1]")
    public WebElement pauseBtn;
    @FindBy(xpath ="//button[@class='vjs-mute-control vjs-control vjs-button vjs-vol-3']")
    public WebElement muteBtn;

    @FindBy(xpath ="//*[@id=\"global-header\"]/div[2]/ul/li[2]/div/div/ul[1]/li[9]/a")
    public WebElement logoutBtn;
    @FindBy(xpath ="//a[@id='global-user-trigger']")
    public WebElement userIcon;

    public void clickOnSearchIcon(){
        safeClickOnElement(searchIcon);
    }
    public void enterSearchTerm(String searchTerm){
        sendKeysToElement(searchInput,searchTerm);
    }
    public void clickOnSearchButton(){
        safeClickOnElement(searchBtn);
    }

    public SearchResultPage doSearch(String searchTerm){
        clickOnSearchIcon();
        enterSearchTerm(searchTerm);
        clickOnSearchButton();
        return new SearchResultPage();

    }

    public ResultPage clickOnSoccerButton(){
        safeClickOnElement(soccerBtn);
        return new ResultPage();
    }
    public void clickOnLogIn(){
        safeClickOnElement(logInLink);
    }
    public void clickOnSignUp(){
        safeClickOnElement(signUpLink);
    }

    public void typeEmail(String email){
        driver.switchTo().frame("oneid-iframe");
        sendKeysToElement(inputEmailField,email);
    }

    public void clickOnContinueButton(){
        safeClickOnElement(continueButton);
    }
    public void inputPassword(String password){
        sendKeysToElement(passwordInputField,password);
    }
    public void clickOnLogInButton(){
        safeClickOnElement(loginBtn);
    }

    public void doLogin(String email, String password){
        clickOnLogIn();

        typeEmail(email);
        clickOnContinueButton();
        inputPassword(password);
        clickOnLogInButton();
    }

    public void doSignUp(String email, String firstName, String lastName, String password){
        clickSignUpLink();
        typeEmail(email);
        typeFirstName(firstName);
        typeLastName(lastName);
        typePassword(password);
        clickSubmitBtn();
    }
    public void hoverOverSoccer(){
        hoverOverElement(soccerBtn);
    }
    public void clickOnVideoButton(){
        safeClickOnElement(videoBtn);
    }
    public void pauseTheVideo(){
        safeClickOnElement(pauseBtn);
    }
    public void muteTheVideo(){
        safeClickOnElement(muteBtn);
    }

    public void doPlayVideo(){
        clickOnVideoButton();
        pauseTheVideo();
        muteTheVideo();
    }
    public WebElement assertLogin(){
        hoverOverElement(userIcon);
        isElementVisible(logoutBtn);
        return logoutBtn;
    }

    public void doLogOut(){
        hoverOverElement(userIcon);
        safeClickOnElement(logoutBtn);
    }

    public WebElement doAssetLogOut(){
        hoverOverElement(userIcon);
        isElementVisible(logInLink);
        return logInLink;
    }
}