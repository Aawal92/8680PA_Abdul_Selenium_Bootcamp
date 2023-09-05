package test_authentication;

import base.BasePage;
import home_page.HomePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import search_result_page.SearchResultPage;
import utils.ExcelData;

public class TestAuthentication extends BasePage {
    @Test
    public void testUserSignIn() {
        String email = "standforhumanity@gmail.com";
        String password = "A123456789a@";

        HomePage homePage = new HomePage();
        homePage.doLogin(email, password);

    }
}