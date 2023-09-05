package test_signup;

import base.BasePage;
import home_page.HomePage;
import org.testng.annotations.Test;

public class TestSignUp extends BasePage {
    @Test
    public void testSignUp(){

        String email = "standforhumanity@gmail.com";
        String firstName = "Abdul";
        String lastName = "Awal";
        String password = "A123456789a@";
        HomePage homePage = new HomePage();
        homePage.doSignUp(email, firstName, lastName, password);

    }
}
