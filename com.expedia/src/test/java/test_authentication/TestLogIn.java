package test_authentication;

import authentication_page.LogInPage;
import base.BasePage;
import home_page.HomePage;
import org.testng.annotations.Test;

public class TestLogIn extends BasePage {
    @Test
    public void testLogIn(){
        String email = "standforhumanity92@gmail.com";
        String password = "A123456789a@";
        HomePage homePage = new HomePage();
        homePage.clickSignInLink();
        LogInPage logInPage = new LogInPage();
        logInPage.doSignIn(email, password);
    }
}
