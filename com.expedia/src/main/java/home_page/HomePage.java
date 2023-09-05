package home_page;

import base.BasePage;
import feedback_page.FeedbackPage;
import flight_page.FlightPage;
import job_page.JobPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    @FindBy(xpath="//button[.='Sign in']")
    public WebElement signInLink;
    @FindBy(xpath="//a[normalize-space()='Feedback']")
    public WebElement feedbackButton;
    @FindBy(xpath = "//a[normalize-space()='Jobs']")
    public WebElement jobsButton;
    @FindBy(xpath = "//span[.='Flights']")
    public WebElement flightsButton;
    @FindBy(xpath="//button[@aria-label='Leaving from']")
    public WebElement leavingFromInputBox;
    @FindBy(xpath="//button[@aria-label='Philadelphia (PHL - Philadelphia Intl.) Pennsylvania, United States']")
    public WebElement airportOption;
    @FindBy(xpath = "//button[@aria-label='Going to']")
    public WebElement goingToInputBox;
    @FindBy(xpath = "//button[@aria-label='Athens (ATH - Eleftherios Venizelos) Greece']")
    public WebElement arrivalAirport;
    @FindBy(xpath = "//button[normalize-space()='Search']")
    public WebElement searchButton;


    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    public void clickSignInLink(){
        safeClickOnElement(signInLink);
    }
    public FeedbackPage clickOnFeedBackButton(){
        safeClickOnElement(feedbackButton);
        return new FeedbackPage();
    }

    public JobPage clickOnJobsButton(){
        safeClickOnElement(jobsButton);
        return  new JobPage();
    }
    public void clickOnFlightButton(){
        safeClickOnElement(flightsButton);
    }
    public void enterDeparturePlace(String cityDeparture){
        sendKeysToElement(leavingFromInputBox,cityDeparture);
    }
    public void clickOnAirportOption(){
        safeClickOnElement(airportOption);
    }
    public void clickOnGoingToInput(){
        safeClickOnElement(goingToInputBox);
    }
    public void enterDestination(String cityArrival){
        sendKeysToElement(goingToInputBox,cityArrival);
    }
    public void clickOnArrivalAirport(){
        safeClickOnElement(arrivalAirport);
    }
    public void clickOnSearchButton(){
        safeClickOnElement(searchButton);
    }
    public FlightPage doSearch(String cityDepart, String cityArrive){
        clickOnFlightButton();
        //clickOnLeavingFromInputBox();
        enterDeparturePlace(cityDepart);
        clickOnAirportOption();
        clickOnGoingToInput();
        enterDestination(cityArrive);
        clickOnArrivalAirport();
        clickOnSearchButton();
        return new FlightPage();
    }

}
