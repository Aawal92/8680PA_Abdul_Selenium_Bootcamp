package test_search;

import base.BasePage;
import home_page.Homepage;
import org.testng.Assert;
import org.testng.annotations.Test;
import search_page.SearchResultsPage;


public class TestSearch extends BasePage {
    Homepage homepage;

    @Test
    public void testDoSearch(String searchTerm, String validationTerm){
        homepage = new Homepage();
        String item = "handsanetizer";
        SearchResultsPage searchResultsPage = homepage.doSearch(item);

    }
}
