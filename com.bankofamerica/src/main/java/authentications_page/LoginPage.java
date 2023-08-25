package authentications_page;

import base.BasePage;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {



    public LoginPage(){
        PageFactory.initElements(driver, this);
    }
}
