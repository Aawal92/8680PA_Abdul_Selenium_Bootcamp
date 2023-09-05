package test_attractions;

import attraction_page.AttractionPage;
import base.BasePage;
import home_page.HomePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import signin_page.SignInPage;

public class TestAttraction extends BasePage {

    @Test
    public void testAttraction() throws InterruptedException {

        HomePage homePage = new HomePage();
        homePage.clickAttractionBtn();
        AttractionPage attractionPage = new AttractionPage();
        attractionPage.attraction();




    }
}
