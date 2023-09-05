package flight_page;

import base.BasePage;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightPage extends BasePage {
    public FlightPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//h6[@class='uitk-heading uitk-heading-7']")
    public WebElement resultTextField;
}
