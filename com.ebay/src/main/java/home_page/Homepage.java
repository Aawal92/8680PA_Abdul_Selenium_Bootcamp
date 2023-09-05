package home_page;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import search_page.SearchResultsPage;

public class Homepage extends BasePage {
    @FindBy(id = "gh-ac")
    public WebElement inputSearchBar;
    @FindBy(id = "gh-btn")
    public WebElement buttonSearchSubmit;

    public Homepage(){
        PageFactory.initElements(driver, this);
    }

    public void inputSearchTerm(String searchTerm){
        clearSendKeysToElement(inputSearchBar, searchTerm);
    }

    public void clickSearchSubmitButton(){
        safeClickOnElement(buttonSearchSubmit);
    }

    public SearchResultsPage doSearch(String searchTerm){
        inputSearchTerm(searchTerm);
        clickSearchSubmitButton();

        return new SearchResultsPage();
    }
}
