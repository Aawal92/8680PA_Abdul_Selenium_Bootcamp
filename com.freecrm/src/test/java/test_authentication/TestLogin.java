package test_authentication;

import base.BasePage;
import dashboard_page.DashboardPage;
import home_page.HomePage;
import login_page.LogInPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogin extends BasePage {


    @Test
    public void testLoginPage(){
        String email = "standforhumanity92@gmail.com";
        String password = "A123456789a$";

        LogInPage logInPage = new LogInPage();
        HomePage homePage = new HomePage();
        homePage.clickSignUpLink();
        logInPage.login(email, password);

        DashboardPage dashboardPage = new DashboardPage();
        Assert.assertTrue(isElementVisible(dashboardPage.userName));
    }


}
