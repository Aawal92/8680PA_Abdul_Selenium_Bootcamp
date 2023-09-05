package test_feedback;

import base.BasePage;
import feedback_page.FeedbackPage;
import home_page.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFeedBack extends BasePage {

    @Test
    public void testFeedBck(){
        HomePage homePage=new HomePage();
        FeedbackPage feedbackPage = homePage.clickOnFeedBackButton();

        String text="Your work the past few weeks has been amazing! ";
        feedbackPage.doFeedBack(text);

        Assert.assertTrue(isElementVisible(feedbackPage.thankYouMessage));
    }
}
