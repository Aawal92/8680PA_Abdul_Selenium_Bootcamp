package test_shoppingCart;

import base.BasePage;
import dashboard_page.DashboardPage;
import home_page.HomePage;
import login_page.LoginPage;
import org.testng.annotations.Test;
import shopping_page.ShoppingPage;

public class TestShoppingCart extends BasePage {
    @Test
    public void testShoppingCart(){
        HomePage homePage = new HomePage();
        LoginPage loginPage = homePage.clickOnLoginLink();
        String email = "standforhumanity92@gmail.com";
        String password = "A123456789a@";
        DashboardPage dashboardPage = loginPage.doSign(email, password);
        ShoppingPage shoppingPage = new ShoppingPage();
        shoppingPage.doShop();
    }
}
