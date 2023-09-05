package test_jobs;

import base.BasePage;
import home_page.HomePage;
import job_page.JobPage;
import org.testng.annotations.Test;

public class TestJobs extends BasePage {
    @Test
    public void testJobs(){
        String jobTitle = "Customer service";
        HomePage homePage = new HomePage();
        homePage.clickOnJobsButton();
        JobPage jobPage = new JobPage();
        jobPage.findJob(jobTitle);
    }
}
