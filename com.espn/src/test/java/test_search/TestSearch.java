package test_search;

import base.BasePage;
import home_page.HomePage;
import org.testng.annotations.Test;

public class TestSearch extends BasePage {
    @Test
    public void testDoSearch() {
        HomePage homePage = new HomePage();
        homePage.doSearch("Soccer");

    }
}
