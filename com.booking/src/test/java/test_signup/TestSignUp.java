package test_signup;

import base.BasePage;
import home_page.HomePage;
import org.testng.annotations.Test;
import signup_page.SignUpPage;

public class TestSignUp extends BasePage {

    /*Test Case: Register to Booking.com
      1.Open your web browser and go to the Booking.com website (www.booking.com).
      2.On the homepage, locate and click on the "Sign in" or "Register" button. It is usually located in the top right corner of the page.
      3.You will be redirected to the login page. Since you want to register as a new user, look for a "Sign up" or "Create account" option. Click on it.
      4.You will be redirected to the login page. Since you want to register as a new user, look for a "Sign up" or "Create account" option. Click on it.
      5.Email address: Provide a valid email address that you have access to.
      6.Click on continue button
      7.Password: Choose a secure password that meets the specified requirements.
      8.click on the "Create account" or "Register" button to proceed.
      9.If all the provided information is valid and complete, you will be redirected to a confirmation page or receive a confirmation email. Follow the instructions provided to verify your email address.
     */

    @Test
    public void singUp(){
        SignUpPage signUpPage = new SignUpPage();
        HomePage homePage = new HomePage();

        String email = "sandforhumanity92@gmail.com";
        String password = "A123456789a";

        homePage.clickSignUpBtn();
        signUpPage.signUp(email,password);

    }

}
