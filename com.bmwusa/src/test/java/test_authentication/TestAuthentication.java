package test_authentication;

import base.BasePage;
import dashboard_page.DashboardPage;
import home_page.HomePage;
import login_page.LoginPage;
import org.testng.annotations.Test;

public class TestAuthentication extends BasePage {
    @Test
    public void testLogin(String email,String password){

        HomePage homePage = new HomePage();
        LoginPage loginPage = homePage.clickOnLoginLink();
        email = "standforhumanity92@gmail.com";
        password = "A123456789a@";
        DashboardPage dashboardPage = loginPage.doSign(email, password);
    }
//    HomePage homePage = new HomePage();
//
//    LoginPage loginPage=homePage.clickOnLoginLink();
//    DashboardPage dashboardPage=loginPage.doSign(email, password);
//    Assert.assertTrue(isElementVisible(dashboardPage.myAccountButton));


}
