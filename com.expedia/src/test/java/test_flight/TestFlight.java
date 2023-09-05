package test_flight;

import base.BasePage;
import flight_page.FlightPage;
import home_page.HomePage;
import org.testng.annotations.Test;

public class TestFlight extends BasePage {
    @Test
    public void testDoSearchFlight(){
        HomePage homePage=new HomePage();
        String cityA="Philadelphia";
        String cityB="Florida";
        FlightPage flightPage = homePage.doSearch(cityA, cityB);

    }
}
