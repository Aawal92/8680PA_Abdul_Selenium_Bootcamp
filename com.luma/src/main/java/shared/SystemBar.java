package shared;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SharedComponents extends BasePage {

    @FindBy(xpath = "//header[@class = 'page-header']//a[@class='logo']")
    public WebElement companyLogo;

    public SharedComponents(){
        PageFactory.initElements(driver, this);
    }
}
