package test_registration;

import base.BasePage;
import org.testng.annotations.Test;
import registration_page.RegistrationPage;
public class TestCreateAccount extends BasePage {
    @Test
    public void testRegistration(){
        String firstName = "Tareq";
        String lastName = "Awal";
        String email = "standforhumanity92@gmail.com";
        String password = "123456789";

        RegistrationPage registrationPage = new RegistrationPage();
        registrationPage.doRegistration(firstName, lastName, email, password);

    }
}
