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
