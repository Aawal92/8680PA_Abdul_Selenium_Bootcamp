package dashboard_page;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends BasePage {
    @FindBy(xpath = "//span[@class = 'user-display']")
    public WebElement userName;

    public DashboardPage(){
        PageFactory.initElements(driver, this);
    }

}
