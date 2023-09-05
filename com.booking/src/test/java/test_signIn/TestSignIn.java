package test_signIn;

import base.BasePage;
import home_page.HomePage;
import org.testng.annotations.Test;
import signin_page.SignInPage;

public class TestSignIn extends BasePage {
    @Test
    public void signIn(){
        String email = "standforhumanity92@gmail.com";
        String password = "A123456789a@";
        HomePage homePage = new HomePage();
        homePage.clickSignInBtn();
        SignInPage signInPage = new SignInPage();
        signInPage.signIn(email,password);

    }
}
