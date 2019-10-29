package TestCases;

import Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;
import Utilities.Utils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {

    HomePage homepage;
    private static Logger log = LogManager.getLogger(LoginPageTest.class);

    public HomePageTest(){
        super();
    }

    @BeforeMethod
    public void  setup(ITestResult result){
        homepage = new HomePage();
        log.info("Testing " + result.getMethod().getMethodName());
    }



    @Test(priority = 1)
    public void TitleTest() {

        String title = driver.getTitle();
        Assert.assertEquals(title, "Partner Center | Falcon Tech Community | Trancending Value");
    }


    @Test(priority = 2)
    public void Test_HomePageLogo() throws Exception {
        Assert.assertTrue(homepage.verify_HomePageLogo());
    }


    @Test(priority = 3)
    public void Test_PartnerHome() throws Exception {
        Assert.assertTrue(homepage.verify_PartnerHome());
    }

    @Test (priority = 4)
    public void Test_ManageTeam() throws Exception {
        Assert.assertTrue(homepage.verify_ManageTeam());
    }

    @Test (priority = 5)
    public void Test_DealRegistrations() throws Exception {
        Assert.assertTrue(homepage.verify_DealRegistrations());
    }

    @Test (priority = 6)
    public void Test_Opportunities() throws Exception {
        Assert.assertTrue(homepage.verify_Opportunities());
    }

    @Test (priority = 7)
    public void Test_Accounts() throws Exception {
        Assert.assertTrue(homepage.verify_Accounts());
    }

    @Test (priority = 8)
    public void Test_Resources() throws Exception {
        Assert.assertTrue(homepage.verify_Resources());
    }


    @Test (priority = 9)
    public void Test_MarketingCenter() throws Exception {
        Assert.assertTrue(homepage.verify_MarketingCenter());
    }


    @Test (priority = 10)
    public void Test_Reports() throws Exception {
        Assert.assertTrue(homepage.verify_Reports());
    }

    @Test (priority = 11)
    public void Test_Documents() throws Exception {
        Assert.assertTrue(homepage.verify_Documents());
    }

    @Test (priority = 12)
    public void Test_DropDown() throws Exception {
        Assert.assertTrue(homepage.verify_DropDown());
    }

    @Test (priority = 13)
    public void Test_Training() throws Exception {
        Assert.assertTrue(homepage.verify_Training());
    }

    @Test (priority = 14)
    public void Test_MDF() throws Exception {
        Assert.assertTrue(homepage.verify_MDF());
    }


    @Test (priority = 15)
    public void Test_Marketplace() throws Exception {
        Assert.assertTrue(homepage.verify_Marketplace());
    }


    @Test (priority = 16)
    public void Test_MarketplacePublishing() throws Exception {
        Assert.assertTrue(homepage.verify_MarketplacePublishing());
    }

    @Test (priority = 17)
    public void Test_Ideas() throws Exception {
        Assert.assertTrue(homepage.verify_Ideas());
    }

    @Test (priority = 18)
    public void Test_NewsFeed() throws Exception {
        Assert.assertTrue(homepage.verify_NewsFeed());
    }


    @Test (priority = 19)
    public void Test_PartnerTraining() throws Exception {
        Assert.assertTrue(homepage.verify_PartnerTraining());
    }

    @Test (priority = 20)
    public void Test_PortalConfiguration() throws Exception {
        Assert.assertTrue(homepage.verify_PortalConfiguration());
    }

    @Test (priority = 21)
    public void Test_More() throws Exception {
        Assert.assertTrue(homepage.verify_More());
    }

    @Test (priority = 22)
    public void Test_Accounts2() throws Exception {
        Assert.assertTrue(homepage.verify_Accounts2());
    }

    @Test (priority = 23)
    public void Test_ApplianceRequestForm() throws Exception {
        Assert.assertTrue(homepage.verify_ApplianceRequestForm());
    }

    @Test (priority = 24)
    public void Test_Campaigns() throws Exception {
        Assert.assertTrue(homepage.verify_Campaigns());
    }

    @Test (priority = 25)
    public void Test_Community() throws Exception {
        Assert.assertTrue(homepage.verify_Community());
    }

    @Test (priority = 26)
    public void Test_CustomerHome() throws Exception {
        Assert.assertTrue(homepage.verify_CustomerHome());
    }

    @Test (priority = 27)
    public void Test_DealRegistrations2() throws Exception {
        Assert.assertTrue(homepage.verify_DealRegistrations2());
    }

    @Test (priority = 28)
    public void Test_Directory() throws Exception {
        Assert.assertTrue(homepage.verify_Directory());
    }

    @Test (priority = 29)
    public void Test_Documents2() throws Exception {
        Assert.assertTrue(homepage.verify_Documents2());
    }

    @Test (priority = 30)
    public void Test_EngagementDashboard() throws Exception {
        Assert.assertTrue(homepage.verify_EngagementDashboard());
    }

    @Test (priority = 31)
    public void Test_EventsCalendar2() throws Exception {
        Assert.assertTrue(homepage.verify_EventsCalendar2());
    }

    @Test (priority = 32)
    public void Test_TechStore() throws Exception {
        Assert.assertTrue(homepage.verify_TechStore());
    }

    @Test (priority = 33)
    public void Test_Forums() throws Exception {
        Assert.assertTrue(homepage.verify_Forums());
    }

    @Test (priority = 34)
    public void Test_GoToMeeting() throws Exception {
        Assert.assertTrue(homepage.verify_GoToMeeting());
    }

    @Test (priority = 35)
    public void Test_Groups() throws Exception {
        Assert.assertTrue(homepage.verify_Groups());
    }

    @Test (priority = 36)
    public void Test_HelpTickets() throws Exception {
        Assert.assertTrue(homepage.verify_HelpTickets());
    }

    @Test (priority = 37)
    public void Test_Ideas2() throws Exception {
        Assert.assertTrue(homepage.verify_Ideas2());
    }

    @Test (priority = 38)
    public void Test_KnowledgeBase() throws Exception {
        Assert.assertTrue(homepage.verify_KnowledgeBase());
    }

    @Test (priority = 39)
    public void Test_LLPlaybox() throws Exception {
        Assert.assertTrue(homepage.verify_LLPlaybox());
    }

    @Test (priority = 40)
    public void Test_ManageTeam2() throws Exception {
        Assert.assertTrue(homepage.verify_ManageTeam2());
    }

    @Test (priority = 41)
    public void Test_MarketingCenter2() throws Exception {
        Assert.assertTrue(homepage.verify_MarketingCenter2());
    }

    @Test (priority = 42)
    public void Test_Marketplace2() throws Exception {
        Assert.assertTrue(homepage.verify_Marketplace2());
    }

    @Test (priority = 43)
    public void Test_MarketplacePublishing2() throws Exception {
        Assert.assertTrue(homepage.verify_MarketplacePublishing2());
    }

    @Test (priority = 44)
    public void Test_MDFRequests() throws Exception {
        Assert.assertTrue(homepage.verify_MDFRequests());
    }

    @Test (priority = 45)
    public void Test_NewPartnerTraining() throws Exception {
        Assert.assertTrue(homepage.verify_NewPartnerTraining());
    }
























    @AfterMethod
    public void getResults(ITestResult result) {

        if (result.getStatus() == ITestResult.FAILURE) {
            Utils.captureScreenshot(driver, result.getMethod().getMethodName() );
            log.info("Test: " + result.getMethod().getMethodName() + " == Failed");
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            log.info("Test: " + result.getMethod().getMethodName() + " == Passed");
        } else if (result.getStatus() == ITestResult.SKIP){
            log.info("Test: " + result.getMethod().getMethodName() + " == Skipped");

        }
    }

}
