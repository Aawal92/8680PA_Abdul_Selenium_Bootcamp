package search_result_page;

import base.BasePage;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage extends BasePage {

    public SearchResultPage(){
        PageFactory.initElements(driver, this);
    }
}
