package test_authentication;

import base.BasePage;
import home_page.HomePage;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import signin_page.SigninPage;

public class TestSignin extends BasePage {
    String email = "standforhumanity92@gmail.com";
    String password = "A123456789a$";
    @Test
    public void SignIn(){
        HomePage homePage = new HomePage();
        SigninPage signinPage = new SigninPage();
        homePage.signInlink();
        signinPage.signIn(email, password);
        //webDriverWait.until(ExpectedConditions.visibilityOf(signinPage.loginHeader));
        //signinPage.signIn(email, password);



    }
}
